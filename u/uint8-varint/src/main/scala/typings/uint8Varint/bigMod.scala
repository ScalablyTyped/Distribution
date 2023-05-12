package typings.uint8Varint

import typings.uint8Varint.distSrcBigMod.BigVarintCodec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object bigMod {
  
  @JSImport("uint8-varint/big", "signed")
  @js.native
  val signed: BigVarintCodec = js.native
  
  @JSImport("uint8-varint/big", "unsigned")
  @js.native
  val unsigned: BigVarintCodec = js.native
  
  @JSImport("uint8-varint/big", "zigzag")
  @js.native
  val zigzag: BigVarintCodec = js.native
}
