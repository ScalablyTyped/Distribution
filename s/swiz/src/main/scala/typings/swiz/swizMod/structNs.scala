package typings.swiz.swizMod

import typings.swiz.swizMod.structNs.IField
import typings.swiz.swizMod.structNs.IFieldOptions
import typings.swiz.swizMod.structNs.IObj
import typings.swiz.swizMod.structNs.IObjOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiz", "struct")
@js.native
object structNs extends js.Object {
  trait IField extends js.Object {
    var attribute: Boolean
    var coerceTo: js.Any
    var desc: js.UndefOr[String] = js.undefined
    var enumerated: Boolean
    var filterFrom: js.Array[String]
    var ignorePublic: Boolean
    var name: String
    var options: IFieldOptions
    var plural: String
    var singular: String
    var src: String
    var `val`: js.UndefOr[IChain] = js.undefined
  }
  
  trait IFieldOptions extends js.Object {
    var attribute: js.UndefOr[Boolean] = js.undefined
    var coerceTo: js.UndefOr[String] = js.undefined
    var desc: js.UndefOr[String] = js.undefined
    var enumerated: js.UndefOr[js.Any] = js.undefined
    var filterFrom: js.UndefOr[js.Array[String]] = js.undefined
    var ignorePublic: js.UndefOr[Boolean] = js.undefined
    var plural: js.UndefOr[String] = js.undefined
    var singular: js.UndefOr[String] = js.undefined
    var src: js.UndefOr[String] = js.undefined
    var `val`: js.UndefOr[IChain] = js.undefined
  }
  
  trait IObj extends js.Object {
    var fields: js.Array[IField]
    var name: String
    var options: IObjOptions
    var plural: String
    var singular: String
  }
  
  trait IObjOptions extends js.Object {
    var fields: js.UndefOr[js.Array[IField]] = js.undefined
    var plural: js.UndefOr[String] = js.undefined
    var singular: js.UndefOr[String] = js.undefined
  }
  
  def Field(name: String): IField = js.native
  def Field(name: String, options: IFieldOptions): IField = js.native
  def Obj(name: String): IObj = js.native
  def Obj(name: String, options: IObjOptions): IObj = js.native
  def coerce(value: js.Any, coerceTo: String): js.Any = js.native
}

