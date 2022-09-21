package typings.yandexMaps.mod

import typings.yandexMaps.mod.layout.templateBased.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateLayoutFactory {
  
  @JSImport("yandex-maps", "templateLayoutFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClass[O /* <: js.Object */, S /* <: js.Object */](template: String): IClassConstructor[Base & O & S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(template.asInstanceOf[js.Any]).asInstanceOf[IClassConstructor[Base & O & S]]
  inline def createClass[O /* <: js.Object */, S /* <: js.Object */](template: String, overrides: O): IClassConstructor[Base & O & S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(template.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[IClassConstructor[Base & O & S]]
  inline def createClass[O /* <: js.Object */, S /* <: js.Object */](template: String, overrides: O, staticMethods: S): IClassConstructor[Base & O & S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(template.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], staticMethods.asInstanceOf[js.Any])).asInstanceOf[IClassConstructor[Base & O & S]]
  inline def createClass[O /* <: js.Object */, S /* <: js.Object */](template: String, overrides: Unit, staticMethods: S): IClassConstructor[Base & O & S] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(template.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], staticMethods.asInstanceOf[js.Any])).asInstanceOf[IClassConstructor[Base & O & S]]
}
