package typings.yandexMaps.global.ymaps

import typings.yandexMaps.mod.IClassConstructor
import typings.yandexMaps.mod.layout.templateBased.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateLayoutFactory {
  
  @JSGlobal("ymaps.templateLayoutFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClass(template: String): IClassConstructor[Base] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(template.asInstanceOf[js.Any]).asInstanceOf[IClassConstructor[Base]]
  inline def createClass(template: String, overrides: js.Object): IClassConstructor[Base] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(template.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[IClassConstructor[Base]]
  inline def createClass(template: String, overrides: js.Object, staticMethods: js.Object): IClassConstructor[Base] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(template.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], staticMethods.asInstanceOf[js.Any])).asInstanceOf[IClassConstructor[Base]]
  inline def createClass(template: String, overrides: Unit, staticMethods: js.Object): IClassConstructor[Base] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(template.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], staticMethods.asInstanceOf[js.Any])).asInstanceOf[IClassConstructor[Base]]
}
