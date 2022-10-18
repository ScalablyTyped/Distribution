package typings.typedoc

import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.ExpressionWithTypeArguments
import typings.typescript.mod.InterfaceDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.SyntaxKind.ExtendsKeyword
import typings.typescript.mod.SyntaxKind.ImplementsKeyword
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterUtilsNodesMod {
  
  @JSImport("typedoc/dist/lib/converter/utils/nodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHeritageTypes(declarations: js.Array[ClassDeclaration | InterfaceDeclaration], kind: ExtendsKeyword): js.Array[ExpressionWithTypeArguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeritageTypes")(declarations.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.Array[ExpressionWithTypeArguments]]
  inline def getHeritageTypes(declarations: js.Array[ClassDeclaration | InterfaceDeclaration], kind: ImplementsKeyword): js.Array[ExpressionWithTypeArguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeritageTypes")(declarations.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.Array[ExpressionWithTypeArguments]]
  
  inline def isNamedNode(node: Node): /* is typedoc.anon.NodenameIdentifierPrivate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typedoc.anon.NodenameIdentifierPrivate */ Boolean]
  
  inline def isObjectType(`type`: Type): /* is typescript.typescript.ObjectType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ObjectType */ Boolean]
}
