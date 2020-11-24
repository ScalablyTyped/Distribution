package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.ObjectMethod_
import typings.babelTypes.mod.ObjectProperty_
import typings.babelTypes.mod.TSType
import typings.vueInbrowserCompilerUtils.typesMod.PropDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/script-handlers/propHandler", JSImport.Namespace)
@js.native
object propHandlerMod extends js.Object {
  
  def default(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  def describeDefault(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, _]],
    propDescriptor: PropDescriptor,
    propType: String
  ): Unit = js.native
  
  def describeRequired(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, _]],
    propDescriptor: PropDescriptor
  ): Unit = js.native
  
  def describeType(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, _]],
    propDescriptor: PropDescriptor
  ): js.UndefOr[String] = js.native
  
  def extractValuesFromTags(propDescriptor: PropDescriptor): Unit = js.native
  
  def getValuesFromTypeAnnotation(`type`: TSType): js.UndefOr[js.Array[String]] = js.native
}
