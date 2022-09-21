package typings.yandexMaps.anon

import typings.yandexMaps.mod.IClassConstructor
import typings.yandexMaps.mod.layout.templateBased.Base
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoftemplateLayoutFacto extends StObject {
  
  def createClass[O /* <: js.Object */, S /* <: js.Object */](template: String): IClassConstructor[Base & O & S] = js.native
  def createClass[O /* <: js.Object */, S /* <: js.Object */](template: String, overrides: O): IClassConstructor[Base & O & S] = js.native
  def createClass[O /* <: js.Object */, S /* <: js.Object */](template: String, overrides: O, staticMethods: S): IClassConstructor[Base & O & S] = js.native
  def createClass[O /* <: js.Object */, S /* <: js.Object */](template: String, overrides: Unit, staticMethods: S): IClassConstructor[Base & O & S] = js.native
}
