package typings.uuidjs

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuidjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("uuidjs", JSImport.Default)
  @js.native
  class default () extends UUIDClass
  /* static members */
  object default {
    
    @JSImport("uuidjs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("uuidjs", "default.FIELD_NAMES")
    @js.native
    val FIELD_NAMES: js.Array[String] = js.native
    
    @JSImport("uuidjs", "default.FIELD_SIZES")
    @js.native
    val FIELD_SIZES: js.Array[Double] = js.native
    
    @JSImport("uuidjs", "default.NIL")
    @js.native
    val NIL: UUIDClass = js.native
    
    @JSImport("uuidjs", "default.genV1")
    @js.native
    def genV1(): UUIDClass = js.native
    
    @JSImport("uuidjs", "default.genV4")
    @js.native
    def genV4(): UUIDClass = js.native
    
    @JSImport("uuidjs", "default.generate")
    @js.native
    def generate(): String = js.native
    
    // Hide unnecessary methods
    @JSImport("uuidjs", "default.overwrittenUUID")
    @js.native
    def overwrittenUUID: js.Any = js.native
    @scala.inline
    def overwrittenUUID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overwrittenUUID")(x.asInstanceOf[js.Any])
    
    @JSImport("uuidjs", "default.parse")
    @js.native
    def parse(strId: String): UUIDClass = js.native
    
    @JSImport("uuidjs", "default.resetState")
    @js.native
    def resetState(): Unit = js.native
    
    @JSImport("uuidjs", "default.useMathRandom")
    @js.native
    def useMathRandom(): Unit = js.native
  }
  
  @JSImport("uuidjs", "FIELD_NAMES")
  @js.native
  val FIELD_NAMES: js.Array[String] = js.native
  
  @JSImport("uuidjs", "FIELD_SIZES")
  @js.native
  val FIELD_SIZES: js.Array[Double] = js.native
  
  @JSImport("uuidjs", "NIL")
  @js.native
  val NIL: UUID = js.native
  
  @JSImport("uuidjs", "genV1")
  @js.native
  def genV1(): UUID = js.native
  
  @JSImport("uuidjs", "genV4")
  @js.native
  def genV4(): UUID = js.native
  
  @JSImport("uuidjs", "generate")
  @js.native
  def generate(): String = js.native
  
  @JSImport("uuidjs", "overwrittenUUID")
  @js.native
  def overwrittenUUID: js.Any = js.native
  @scala.inline
  def overwrittenUUID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overwrittenUUID")(x.asInstanceOf[js.Any])
  
  @JSImport("uuidjs", "parse")
  @js.native
  def parse(strId: String): UUID = js.native
  
  @JSImport("uuidjs", "resetState")
  @js.native
  def resetState(): Unit = js.native
  
  @JSImport("uuidjs", "useMathRandom")
  @js.native
  def useMathRandom(): Unit = js.native
  
  /** @deprecated Use class-based API */
  @js.native
  trait UUID extends StObject {
    
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
      equals_ : UUID => Boolean,
      hexFields: UUIDFields[String],
      hexNoDelim: String,
      hexString: String,
      intFields: UUIDFields[Double],
      urn: String,
      version: Double
    ): UUID = {
      val __obj = js.Dynamic.literal(bitFields = bitFields.asInstanceOf[js.Any], bitString = bitString.asInstanceOf[js.Any], hexFields = hexFields.asInstanceOf[js.Any], hexNoDelim = hexNoDelim.asInstanceOf[js.Any], hexString = hexString.asInstanceOf[js.Any], intFields = intFields.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[UUID]
    }
    
    @scala.inline
    implicit class UUIDMutableBuilder[Self <: UUID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitFields(value: UUIDFields[String]): Self = StObject.set(x, "bitFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitString(value: String): Self = StObject.set(x, "bitString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_(value: UUID => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHexFields(value: UUIDFields[String]): Self = StObject.set(x, "hexFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHexNoDelim(value: String): Self = StObject.set(x, "hexNoDelim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHexString(value: String): Self = StObject.set(x, "hexString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntFields(value: UUIDFields[Double]): Self = StObject.set(x, "intFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UUIDClass extends StObject {
    
    val bitFields: UUIDFields[String] = js.native
    
    val bitString: String = js.native
    
    def equals(uuid: UUIDClass): Boolean = js.native
    
    val hexFields: UUIDFields[String] = js.native
    
    val hexNoDelim: String = js.native
    
    val hexString: String = js.native
    
    val intFields: UUIDFields[Double] = js.native
    
    val urn: String = js.native
    
    val version: Double = js.native
  }
  object UUIDClass {
    
    @scala.inline
    def apply(
      bitFields: UUIDFields[String],
      bitString: String,
      equals_ : UUIDClass => Boolean,
      hexFields: UUIDFields[String],
      hexNoDelim: String,
      hexString: String,
      intFields: UUIDFields[Double],
      urn: String,
      version: Double
    ): UUIDClass = {
      val __obj = js.Dynamic.literal(bitFields = bitFields.asInstanceOf[js.Any], bitString = bitString.asInstanceOf[js.Any], hexFields = hexFields.asInstanceOf[js.Any], hexNoDelim = hexNoDelim.asInstanceOf[js.Any], hexString = hexString.asInstanceOf[js.Any], intFields = intFields.asInstanceOf[js.Any], urn = urn.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[UUIDClass]
    }
    
    @scala.inline
    implicit class UUIDClassMutableBuilder[Self <: UUIDClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitFields(value: UUIDFields[String]): Self = StObject.set(x, "bitFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitString(value: String): Self = StObject.set(x, "bitString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_(value: UUIDClass => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHexFields(value: UUIDFields[String]): Self = StObject.set(x, "hexFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHexNoDelim(value: String): Self = StObject.set(x, "hexNoDelim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHexString(value: String): Self = StObject.set(x, "hexString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntFields(value: UUIDFields[Double]): Self = StObject.set(x, "intFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UUIDFields[T] extends Array[T] {
    
    var clockSeqHiAndReserved: T = js.native
    
    var clockSeqLow: T = js.native
    
    var node: T = js.native
    
    var timeHiAndVersion: T = js.native
    
    var timeLow: T = js.native
    
    var timeMid: T = js.native
  }
}
