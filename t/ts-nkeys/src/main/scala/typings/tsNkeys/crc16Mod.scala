package typings.tsNkeys

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-nkeys/lib/crc16", JSImport.Namespace)
@js.native
object crc16Mod extends js.Object {
  
  @js.native
  class crc16 () extends js.Object
  /* static members */
  @js.native
  object crc16 extends js.Object {
    
    def checksum(data: Buffer): Double = js.native
    
    def validate(data: Buffer, expected: Double): Boolean = js.native
  }
}
