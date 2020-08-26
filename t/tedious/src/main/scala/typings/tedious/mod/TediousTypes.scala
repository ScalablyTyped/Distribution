package typings.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TediousTypes extends js.Object {
  var BigInt: TediousType = js.native
  var Binary: TediousType = js.native
  var Bit: TediousType = js.native
  var Char: TediousType = js.native
  var Date: TediousType = js.native
  var DateTime: TediousType = js.native
  var DateTime2: TediousType = js.native
  var DateTimeOffset: TediousType = js.native
  var Decimal: TediousType = js.native
  var Float: TediousType = js.native
  var Image: TediousType = js.native
  var Int: TediousType = js.native
  var Money: TediousType = js.native
  var NChar: TediousType = js.native
  var NText: TediousType = js.native
  var NVarChar: TediousType = js.native
  var Null: TediousType = js.native
  var Numeric: TediousType = js.native
  var Real: TediousType = js.native
  var SmallDateTime: TediousType = js.native
  var SmallInt: TediousType = js.native
  var SmallMoney: TediousType = js.native
  var TVP: TediousType = js.native
  var Text: TediousType = js.native
  var Time: TediousType = js.native
  var TinyInt: TediousType = js.native
  var UDT: TediousType = js.native
  var UniqueIdentifier: TediousType = js.native
  var VarBinary: TediousType = js.native
  var VarChar: TediousType = js.native
  var Xml: TediousType = js.native
}

object TediousTypes {
  @scala.inline
  def apply(
    BigInt: TediousType,
    Binary: TediousType,
    Bit: TediousType,
    Char: TediousType,
    Date: TediousType,
    DateTime: TediousType,
    DateTime2: TediousType,
    DateTimeOffset: TediousType,
    Decimal: TediousType,
    Float: TediousType,
    Image: TediousType,
    Int: TediousType,
    Money: TediousType,
    NChar: TediousType,
    NText: TediousType,
    NVarChar: TediousType,
    Null: TediousType,
    Numeric: TediousType,
    Real: TediousType,
    SmallDateTime: TediousType,
    SmallInt: TediousType,
    SmallMoney: TediousType,
    TVP: TediousType,
    Text: TediousType,
    Time: TediousType,
    TinyInt: TediousType,
    UDT: TediousType,
    UniqueIdentifier: TediousType,
    VarBinary: TediousType,
    VarChar: TediousType,
    Xml: TediousType
  ): TediousTypes = {
    val __obj = js.Dynamic.literal(BigInt = BigInt.asInstanceOf[js.Any], Binary = Binary.asInstanceOf[js.Any], Bit = Bit.asInstanceOf[js.Any], Char = Char.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], DateTime = DateTime.asInstanceOf[js.Any], DateTime2 = DateTime2.asInstanceOf[js.Any], DateTimeOffset = DateTimeOffset.asInstanceOf[js.Any], Decimal = Decimal.asInstanceOf[js.Any], Float = Float.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Int = Int.asInstanceOf[js.Any], Money = Money.asInstanceOf[js.Any], NChar = NChar.asInstanceOf[js.Any], NText = NText.asInstanceOf[js.Any], NVarChar = NVarChar.asInstanceOf[js.Any], Null = Null.asInstanceOf[js.Any], Numeric = Numeric.asInstanceOf[js.Any], Real = Real.asInstanceOf[js.Any], SmallDateTime = SmallDateTime.asInstanceOf[js.Any], SmallInt = SmallInt.asInstanceOf[js.Any], SmallMoney = SmallMoney.asInstanceOf[js.Any], TVP = TVP.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], TinyInt = TinyInt.asInstanceOf[js.Any], UDT = UDT.asInstanceOf[js.Any], UniqueIdentifier = UniqueIdentifier.asInstanceOf[js.Any], VarBinary = VarBinary.asInstanceOf[js.Any], VarChar = VarChar.asInstanceOf[js.Any], Xml = Xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[TediousTypes]
  }
  @scala.inline
  implicit class TediousTypesOps[Self <: TediousTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBigInt(value: TediousType): Self = this.set("BigInt", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinary(value: TediousType): Self = this.set("Binary", value.asInstanceOf[js.Any])
    @scala.inline
    def setBit(value: TediousType): Self = this.set("Bit", value.asInstanceOf[js.Any])
    @scala.inline
    def setChar(value: TediousType): Self = this.set("Char", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: TediousType): Self = this.set("Date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateTime(value: TediousType): Self = this.set("DateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateTime2(value: TediousType): Self = this.set("DateTime2", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateTimeOffset(value: TediousType): Self = this.set("DateTimeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecimal(value: TediousType): Self = this.set("Decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloat(value: TediousType): Self = this.set("Float", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: TediousType): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def setInt(value: TediousType): Self = this.set("Int", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoney(value: TediousType): Self = this.set("Money", value.asInstanceOf[js.Any])
    @scala.inline
    def setNChar(value: TediousType): Self = this.set("NChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setNText(value: TediousType): Self = this.set("NText", value.asInstanceOf[js.Any])
    @scala.inline
    def setNVarChar(value: TediousType): Self = this.set("NVarChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setNull(value: TediousType): Self = this.set("Null", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumeric(value: TediousType): Self = this.set("Numeric", value.asInstanceOf[js.Any])
    @scala.inline
    def setReal(value: TediousType): Self = this.set("Real", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmallDateTime(value: TediousType): Self = this.set("SmallDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmallInt(value: TediousType): Self = this.set("SmallInt", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmallMoney(value: TediousType): Self = this.set("SmallMoney", value.asInstanceOf[js.Any])
    @scala.inline
    def setTVP(value: TediousType): Self = this.set("TVP", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: TediousType): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: TediousType): Self = this.set("Time", value.asInstanceOf[js.Any])
    @scala.inline
    def setTinyInt(value: TediousType): Self = this.set("TinyInt", value.asInstanceOf[js.Any])
    @scala.inline
    def setUDT(value: TediousType): Self = this.set("UDT", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueIdentifier(value: TediousType): Self = this.set("UniqueIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setVarBinary(value: TediousType): Self = this.set("VarBinary", value.asInstanceOf[js.Any])
    @scala.inline
    def setVarChar(value: TediousType): Self = this.set("VarChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setXml(value: TediousType): Self = this.set("Xml", value.asInstanceOf[js.Any])
  }
  
}

