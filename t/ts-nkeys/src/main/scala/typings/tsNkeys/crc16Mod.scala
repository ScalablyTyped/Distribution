package typings.tsNkeys

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crc16Mod {
  
  @JSImport("ts-nkeys/lib/crc16", "crc16")
  @js.native
  class crc16 () extends StObject
  /* static members */
  object crc16 {
    
    @JSImport("ts-nkeys/lib/crc16", "crc16.checksum")
    @js.native
    def checksum(data: Buffer): Double = js.native
    
    @JSImport("ts-nkeys/lib/crc16", "crc16.validate")
    @js.native
    def validate(data: Buffer, expected: Double): Boolean = js.native
  }
}
