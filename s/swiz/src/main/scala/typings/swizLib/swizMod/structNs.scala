package typings
package swizLib.swizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiz", "struct")
@js.native
object structNs extends js.Object {
  trait IField extends js.Object {
    var attribute: scala.Boolean
    var coerceTo: js.Any
    var desc: js.UndefOr[java.lang.String] = js.undefined
    var enumerated: scala.Boolean
    var filterFrom: js.Array[java.lang.String]
    var ignorePublic: scala.Boolean
    var name: java.lang.String
    var options: IFieldOptions
    var plural: java.lang.String
    var singular: java.lang.String
    var src: java.lang.String
    var `val`: js.UndefOr[swizLib.swizMod.IChain] = js.undefined
  }
  
  trait IFieldOptions extends js.Object {
    var attribute: js.UndefOr[scala.Boolean] = js.undefined
    var coerceTo: js.UndefOr[java.lang.String] = js.undefined
    var desc: js.UndefOr[java.lang.String] = js.undefined
    var enumerated: js.UndefOr[js.Any] = js.undefined
    var filterFrom: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var ignorePublic: js.UndefOr[scala.Boolean] = js.undefined
    var plural: js.UndefOr[java.lang.String] = js.undefined
    var singular: js.UndefOr[java.lang.String] = js.undefined
    var src: js.UndefOr[java.lang.String] = js.undefined
    var `val`: js.UndefOr[swizLib.swizMod.IChain] = js.undefined
  }
  
  trait IObj extends js.Object {
    var fields: js.Array[IField]
    var name: java.lang.String
    var options: IObjOptions
    var plural: java.lang.String
    var singular: java.lang.String
  }
  
  trait IObjOptions extends js.Object {
    var fields: js.UndefOr[js.Array[IField]] = js.undefined
    var plural: js.UndefOr[java.lang.String] = js.undefined
    var singular: js.UndefOr[java.lang.String] = js.undefined
  }
  
  def Field(name: java.lang.String): IField = js.native
  def Field(name: java.lang.String, options: IFieldOptions): IField = js.native
  def Obj(name: java.lang.String): IObj = js.native
  def Obj(name: java.lang.String, options: IObjOptions): IObj = js.native
  def coerce(value: js.Any, coerceTo: java.lang.String): js.Any = js.native
}

