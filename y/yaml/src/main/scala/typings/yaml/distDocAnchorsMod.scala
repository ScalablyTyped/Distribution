package typings.yaml

import typings.std.Set
import typings.yaml.anon.OnAnchor
import typings.yaml.distDocDocumentMod.Document
import typings.yaml.distNodesNodeMod.Node
import typings.yaml.yamlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocAnchorsMod {
  
  @JSImport("yaml/dist/doc/anchors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def anchorIsValid(anchor: String): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("anchorIsValid")(anchor.asInstanceOf[js.Any]).asInstanceOf[`true`]
  
  inline def anchorNames(root: Document[Node[Any]]): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("anchorNames")(root.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  inline def anchorNames(root: Node[Any]): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("anchorNames")(root.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  
  inline def createNodeAnchors(doc: Document[Node[Any]], prefix: String): OnAnchor = (^.asInstanceOf[js.Dynamic].applyDynamic("createNodeAnchors")(doc.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[OnAnchor]
  
  inline def findNewAnchor(prefix: String, exclude: Set[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("findNewAnchor")(prefix.asInstanceOf[js.Any], exclude.asInstanceOf[js.Any])).asInstanceOf[String]
}
