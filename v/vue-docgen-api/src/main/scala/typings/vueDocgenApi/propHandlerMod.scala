package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.ObjectMethod_
import typings.babelTypes.mod.ObjectProperty_
import typings.babelTypes.mod.TSType
import typings.vueInbrowserCompilerUtils.typesMod.PropDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/propHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def describeDefault(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, js.Any]],
    propDescriptor: PropDescriptor,
    propType: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeDefault")(propPropertiesPath.asInstanceOf[js.Any], propDescriptor.asInstanceOf[js.Any], propType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def describeRequired(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, js.Any]],
    propDescriptor: PropDescriptor
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("describeRequired")(propPropertiesPath.asInstanceOf[js.Any], propDescriptor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def describeType(
    propPropertiesPath: js.Array[NodePath[ObjectProperty_ | ObjectMethod_, js.Any]],
    propDescriptor: PropDescriptor
  ): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("describeType")(propPropertiesPath.asInstanceOf[js.Any], propDescriptor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def extractValuesFromTags(propDescriptor: PropDescriptor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extractValuesFromTags")(propDescriptor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getValuesFromTypeAnnotation(`type`: TSType): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValuesFromTypeAnnotation")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]
}
