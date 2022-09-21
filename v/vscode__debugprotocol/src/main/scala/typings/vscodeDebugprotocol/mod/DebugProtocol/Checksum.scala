package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The checksum of an item calculated by the specified algorithm. */
trait Checksum extends StObject {
  
  /** The algorithm used to calculate this checksum. */
  var algorithm: ChecksumAlgorithm
  
  /** Value of the checksum, encoded as a hexadecimal value. */
  var checksum: String
}
object Checksum {
  
  inline def apply(algorithm: ChecksumAlgorithm, checksum: String): Checksum = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checksum]
  }
  
  extension [Self <: Checksum](x: Self) {
    
    inline def setAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
  }
}
