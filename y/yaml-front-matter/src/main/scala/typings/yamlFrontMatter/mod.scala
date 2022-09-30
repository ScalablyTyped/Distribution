package typings.yamlFrontMatter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.jsYaml.mod.LoadOptions
import typings.node.bufferMod.global.Buffer
import typings.yamlFrontMatter.anon.ContentKeyName
import typings.yamlFrontMatter.anon.Dictkey
import typings.yamlFrontMatter.yamlFrontMatterStrings.loadFront
import typings.yamlFrontMatter.yamlFrontMatterStrings.safeLoadFront
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yaml-front-matter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadFront(content: String): Dictkey = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any]).asInstanceOf[Dictkey]
  inline def loadFront(content: String, options: LoadOptions): Dictkey = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Dictkey]
  inline def loadFront(content: Buffer): Dictkey = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any]).asInstanceOf[Dictkey]
  inline def loadFront(content: Buffer, options: LoadOptions): Dictkey = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Dictkey]
  
  inline def loadFront_contentKeyName_Intersection[contentKeyName /* <: String */](content: String, options: LoadOptions & ContentKeyName[contentKeyName]): loadFront & TopLevel[Any] & StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[loadFront & TopLevel[Any] & StringDictionary[Any]]
  inline def loadFront_contentKeyName_Intersection[contentKeyName /* <: String */](content: Buffer, options: LoadOptions & ContentKeyName[contentKeyName]): loadFront & TopLevel[Any] & StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[loadFront & TopLevel[Any] & StringDictionary[Any]]
  
  inline def safeLoadFront(content: String): Dictkey = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any]).asInstanceOf[Dictkey]
  inline def safeLoadFront(content: String, options: LoadOptions): Dictkey = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Dictkey]
  inline def safeLoadFront(content: Buffer): Dictkey = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any]).asInstanceOf[Dictkey]
  inline def safeLoadFront(content: Buffer, options: LoadOptions): Dictkey = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Dictkey]
  
  inline def safeLoadFront_contentKeyName_Intersection[contentKeyName /* <: String */](content: String, options: LoadOptions & ContentKeyName[contentKeyName]): safeLoadFront & TopLevel[Any] & StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[safeLoadFront & TopLevel[Any] & StringDictionary[Any]]
  inline def safeLoadFront_contentKeyName_Intersection[contentKeyName /* <: String */](content: Buffer, options: LoadOptions & ContentKeyName[contentKeyName]): safeLoadFront & TopLevel[Any] & StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("safeLoadFront")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[safeLoadFront & TopLevel[Any] & StringDictionary[Any]]
}
