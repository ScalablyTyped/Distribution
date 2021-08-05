package typings.tsNkeys

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crc16Mod {
  
  @JSImport("ts-nkeys/lib/crc16", "crc16")
  @js.native
  class crc16 () extends StObject
  /* static members */
  object crc16 {
    
    @JSImport("ts-nkeys/lib/crc16", "crc16")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checksum(data: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("checksum")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def validate(data: Buffer, expected: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(data.asInstanceOf[js.Any], expected.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
