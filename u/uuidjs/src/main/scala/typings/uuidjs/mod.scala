package typings.uuidjs

import typings.uuidjs.anon.ArraynumberreadonlytimeLo
import typings.uuidjs.anon.ArraystringreadonlytimeLo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uuidjs", "UUID")
  @js.native
  /**
    * Initializes the UUID object.
    * @param _timeLow - The time_low field (octet 0-3, uint32).
    * @param _timeMid - The time_mid field (octet 4-5, uint16).
    * @param _timeHiAndVersion - The time_hi_and_version field (octet 6-7, uint16).
    * @param _clockSeqHiAndReserved - The clock_seq_hi_and_reserved field (octet 8, uint8).
    * @param _clockSeqLow - The clock_seq_low field (octet 9, uint8).
    * @param _node - The node field (octet 10-15, uint48).
    */
  /* private */ open class UUID () extends StObject {
    
    /**
      * The UUID internal field values as an array of binary strings.
      */
    val bitFields: ArraystringreadonlytimeLo = js.native
    
    /**
      * The 128-bit binary string representation.
      */
    val bitString: String = js.native
    
    /**
      * Tests if two UUID objects are equal.
      * @returns `true` if two UUID objects are equal.
      */
    def equals(uuid: UUID): Boolean = js.native
    
    /**
      * The UUID internal field values as an array of hexadecimal strings.
      */
    val hexFields: ArraystringreadonlytimeLo = js.native
    
    /**
      * The non-delimited hexadecimal string representation ("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx").
      * @since v3.3.0
      */
    val hexNoDelim: String = js.native
    
    /**
      * The hexadecimal string representation ("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx").
      */
    val hexString: String = js.native
    
    /**
      * The UUID internal field values as an array of integers.
      */
    val intFields: ArraynumberreadonlytimeLo = js.native
    
    /**
      * The URN string representation ("urn:uuid:xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx").
      */
    val urn: String = js.native
    
    /**
      * The UUID version number.
      */
    val version: Double = js.native
  }
  /* static members */
  object UUID {
    
    @JSImport("uuidjs", "UUID")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The names of UUID internal fields.
      * @since 3.0
      */
    @JSImport("uuidjs", "UUID.FIELD_NAMES")
    @js.native
    val FIELD_NAMES: js.Array[String] = js.native
    
    /**
      * The sizes of UUID internal fields.
      * @since 3.0
      */
    @JSImport("uuidjs", "UUID.FIELD_SIZES")
    @js.native
    val FIELD_SIZES: js.Array[Double] = js.native
    
    /**
      * A nil UUID object.
      * @since v3.4.0
      */
    @JSImport("uuidjs", "UUID.NIL")
    @js.native
    val NIL: UUID = js.native
    
    /**
      * Converts an integer to a zero-filled binary string.
      */
    @JSImport("uuidjs", "UUID._binAligner")
    @js.native
    def _binAligner: Any = js.native
    inline def _binAligner_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_binAligner")(x.asInstanceOf[js.Any])
    
    /**
      * Returns an unsigned `x`-bit random integer.
      * @param x - An unsigned integer ranging from 0 to 53, inclusive.
      * @returns An unsigned `x`-bit random integer (`0 <= f(x) < 2^x`).
      */
    @JSImport("uuidjs", "UUID._getRandomInt")
    @js.native
    def _getRandomInt: Any = js.native
    inline def _getRandomInt_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getRandomInt")(x.asInstanceOf[js.Any])
    
    /**
      * @param time - The number of milliseconds elapsed since 1970-01-01.
      */
    @JSImport("uuidjs", "UUID._getTimeFieldValues")
    @js.native
    def _getTimeFieldValues: Any = js.native
    inline def _getTimeFieldValues_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getTimeFieldValues")(x.asInstanceOf[js.Any])
    
    /**
      * Converts an integer to a zero-filled hexadecimal string.
      */
    @JSImport("uuidjs", "UUID._hexAligner")
    @js.native
    def _hexAligner: Any = js.native
    inline def _hexAligner_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_hexAligner")(x.asInstanceOf[js.Any])
    
    @JSImport("uuidjs", "UUID._mathPRNG")
    @js.native
    def _mathPRNG: Any = js.native
    inline def _mathPRNG_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_mathPRNG")(x.asInstanceOf[js.Any])
    
    /**
      * The persistent internal state for version 1 UUID creation.
      */
    @JSImport("uuidjs", "UUID._state")
    @js.native
    def _state: Any = js.native
    inline def _state_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_state")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a version 1 UUID object.
      * @returns A version 1 UUID object.
      * @since 3.0
      */
    inline def genV1(): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("genV1")().asInstanceOf[UUID]
    
    /**
      * Creates a version 4 UUID object.
      * @returns A version 4 UUID object.
      * @since 3.0
      */
    inline def genV4(): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("genV4")().asInstanceOf[UUID]
    
    /**
      * Creates a version 6 UUID object. This function is experimentally provided
      * based on the draft RFC and may be changed or removed in the future without
      * conforming to semantic versioning requirements.
      * @returns A version 6 UUID object.
      * @since v4.2.13
      * @experimental
      */
    inline def genV6(): UUID = ^.asInstanceOf[js.Dynamic].applyDynamic("genV6")().asInstanceOf[UUID]
    
    /**
      * Generates a version 4 UUID as a hexadecimal string.
      * @returns The hexadecimal UUID string.
      */
    inline def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
    
    /**
      * Converts a hexadecimal UUID string to a UUID object.
      * @param strId - A hexadecimal UUID string ("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx").
      * @returns The UUID object or `null`.
      * @since 3.0
      */
    inline def parse(strId: String): UUID | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(strId.asInstanceOf[js.Any]).asInstanceOf[UUID | Null]
    
    /**
      * Re-initializes the internal state for version 1 UUID creation.
      * @since 3.0
      */
    inline def resetState(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetState")().asInstanceOf[Unit]
    
    /**
      * Enables Math.random()-based pseudorandom number generator instead of cryptographically safer options.
      * @since v3.5.0
      * @deprecated This method is provided only to work around performance drawbacks of the safer algorithms.
      */
    inline def useMathRandom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMathRandom")().asInstanceOf[Unit]
  }
}
