package typings.three.fflateModuleMinMod

import typings.three.threeNumbers.`0`
import typings.three.threeNumbers.`10`
import typings.three.threeNumbers.`11`
import typings.three.threeNumbers.`12`
import typings.three.threeNumbers.`1`
import typings.three.threeNumbers.`2`
import typings.three.threeNumbers.`3`
import typings.three.threeNumbers.`4`
import typings.three.threeNumbers.`5`
import typings.three.threeNumbers.`6`
import typings.three.threeNumbers.`7`
import typings.three.threeNumbers.`8`
import typings.three.threeNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeflateOptions extends StObject {
  
  /**
    * The level of compression to use, ranging from 0-9.
    *
    * 0 will store the data without compression.
    * 1 is fastest but compresses the worst, 9 is slowest but compresses the best.
    * The default level is 6.
    *
    * Typically, binary data benefits much more from higher values than text data.
    * In both cases, higher values usually take disproportionately longer than the reduction in final size that results.
    *
    * For example, a 1 MB text file could:
    * - become 1.01 MB with level 0 in 1ms
    * - become 400 kB with level 1 in 10ms
    * - become 320 kB with level 9 in 100ms
    */
  var level: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  
  /**
    * The memory level to use, ranging from 0-12. Increasing this increases speed and compression ratio at the cost of memory.
    *
    * Note that this is exponential: while level 0 uses 4 kB, level 4 uses 64 kB, level 8 uses 1 MB, and level 12 uses 16 MB.
    * It is recommended not to lower the value below 4, since that tends to hurt performance.
    * In addition, values above 8 tend to help very little on most data and can even hurt performance.
    *
    * The default value is automatically determined based on the size of the input data.
    */
  var mem: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`] = js.undefined
}
object DeflateOptions {
  
  inline def apply(): DeflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeflateOptions]
  }
  
  extension [Self <: DeflateOptions](x: Self) {
    
    inline def setLevel(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMem(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12`): Self = StObject.set(x, "mem", value.asInstanceOf[js.Any])
    
    inline def setMemUndefined: Self = StObject.set(x, "mem", js.undefined)
  }
}
