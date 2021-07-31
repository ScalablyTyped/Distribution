package typings.uuidjs

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuidjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("uuidjs", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with UUIDClass {
    
    /* CompleteClass */
    override val bitFields: UUIDFields[String] = js.native
    
    /* CompleteClass */
    override val bitString: String = js.native
    
    /* CompleteClass */
    override def equals(uuid: UUIDClass): Boolean = js.native
    
    /* CompleteClass */
    override val hexFields: UUIDFields[String] = js.native
    
    /* CompleteClass */
    override val hexNoDelim: String = js.native
    
    /* CompleteClass */
    override val hexString: String = js.native
    
    /* CompleteClass */
    override val intFields: UUIDFields[Double] = js.native
    
    /* CompleteClass */
    override val urn: String = js.native
    
    /* CompleteClass */
    override val version: Double = js.native
  }
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
    
    @scala.inline
    def genV1(): UUIDClass = ^.asInstanceOf[js.Dynamic].applyDynamic("genV1")().asInstanceOf[UUIDClass]
    
    @scala.inline
    def genV4(): UUIDClass = ^.asInstanceOf[js.Dynamic].applyDynamic("genV4")().asInstanceOf[UUIDClass]
    
    @scala.inline
    def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
    
    // Hide unnecessary methods
    @JSImport("uuidjs", "default.overwrittenUUID")
    @js.native
    def overwrittenUUID: js.Any = js.native
    @scala.inline
    def overwrittenUUID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overwrittenUUID")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def parse(strId: String): UUIDClass = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(strId.asInstanceOf[js.Any]).asInstanceOf[UUIDClass]
    
    @scala.inline
    def resetState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetState")().asInstanceOf[Unit]
    
    @scala.inline
    def useMathRandom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMathRandom")().asInstanceOf[Unit]
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
  
  @scala.inline
  def genV1(): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("genV1")().asInstanceOf[UUID]
  
  @scala.inline
  def genV4(): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("genV4")().asInstanceOf[UUID]
  
  @scala.inline
  def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
  
  @JSImport("uuidjs", "overwrittenUUID")
  @js.native
  def overwrittenUUID: js.Any = js.native
  @scala.inline
  def overwrittenUUID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overwrittenUUID")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def parse(strId: String): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(strId.asInstanceOf[js.Any]).asInstanceOf[UUID]
  
  @scala.inline
  def resetState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetState")().asInstanceOf[Unit]
  
  @scala.inline
  def useMathRandom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMathRandom")().asInstanceOf[Unit]
  
  /** @deprecated Use class-based API */
  trait UUID extends StObject {
    
    var bitFields: UUIDFields[String]
    
    var bitString: String
    
    def equals(uuid: UUID): Boolean
    
    var hexFields: UUIDFields[String]
    
    var hexNoDelim: String
    
    var hexString: String
    
    var intFields: UUIDFields[Double]
    
    var urn: String
    
    var version: Double
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
  
  trait UUIDClass extends StObject {
    
    val bitFields: UUIDFields[String]
    
    val bitString: String
    
    def equals(uuid: UUIDClass): Boolean
    
    val hexFields: UUIDFields[String]
    
    val hexNoDelim: String
    
    val hexString: String
    
    val intFields: UUIDFields[Double]
    
    val urn: String
    
    val version: Double
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
  trait UUIDFields[T]
    extends StObject
       with Array[T] {
    
    var clockSeqHiAndReserved: T = js.native
    
    var clockSeqLow: T = js.native
    
    var node: T = js.native
    
    var timeHiAndVersion: T = js.native
    
    var timeLow: T = js.native
    
    var timeMid: T = js.native
  }
}
