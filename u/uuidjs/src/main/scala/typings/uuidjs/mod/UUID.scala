package typings.uuidjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Use class-based API */
@js.native
trait UUID extends js.Object {
  
  var bitFields: UUIDFields[String] = js.native
  
  var bitString: String = js.native
  
  def equals(uuid: UUID): Boolean = js.native
  
  var hexFields: UUIDFields[String] = js.native
  
  var hexNoDelim: String = js.native
  
  var hexString: String = js.native
  
  var intFields: UUIDFields[Double] = js.native
  
  var urn: String = js.native
  
  var version: Double = js.native
}
object UUID {
  
  @scala.inline
  def apply(
    bitFields: UUIDFields[String],
    bitString: String,
    equals: UUID => Boolean,
    hexFields: UUIDFields[String],
    hexNoDelim: String,
    hexString: String,
    intFields: UUIDFields[Double],
    urn: String,
    version: Double
  ): UUID = {
    val __obj = js.Dynamic.literal(bitFields = bitFields.asInstanceOf[js.Any], bitString = bitString.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), hexFields = hexFields.asInstanceOf[js.Any], hexNoDelim = hexNoDelim.asInstanceOf[js.Any], hexString = hexString.asInstanceOf[js.Any], intFields = intFields.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUID]
  }
  
  @scala.inline
  implicit class UUIDOps[Self <: UUID] (val x: Self) extends AnyVal {
    
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
    def setBitFields(value: UUIDFields[String]): Self = this.set("bitFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitString(value: String): Self = this.set("bitString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: UUID => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHexFields(value: UUIDFields[String]): Self = this.set("hexFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexNoDelim(value: String): Self = this.set("hexNoDelim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHexString(value: String): Self = this.set("hexString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntFields(value: UUIDFields[Double]): Self = this.set("intFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrn(value: String): Self = this.set("urn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
