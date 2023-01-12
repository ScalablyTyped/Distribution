package typings.ulid

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ulid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeTime(id: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeTime")(id.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def detectPrng(): PRNG = ^.asInstanceOf[js.Dynamic].applyDynamic("detectPrng")().asInstanceOf[PRNG]
  inline def detectPrng(allowInsecure: Boolean): PRNG = ^.asInstanceOf[js.Dynamic].applyDynamic("detectPrng")(allowInsecure.asInstanceOf[js.Any]).asInstanceOf[PRNG]
  inline def detectPrng(allowInsecure: Boolean, root: Any): PRNG = (^.asInstanceOf[js.Dynamic].applyDynamic("detectPrng")(allowInsecure.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[PRNG]
  inline def detectPrng(allowInsecure: Unit, root: Any): PRNG = (^.asInstanceOf[js.Dynamic].applyDynamic("detectPrng")(allowInsecure.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[PRNG]
  
  inline def encodeRandom(len: Double, prng: PRNG): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeRandom")(len.asInstanceOf[js.Any], prng.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeTime(now: Double, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeTime")(now.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def factory(): ULID_ = ^.asInstanceOf[js.Dynamic].applyDynamic("factory")().asInstanceOf[ULID_]
  inline def factory(currPrng: PRNG): ULID_ = ^.asInstanceOf[js.Dynamic].applyDynamic("factory")(currPrng.asInstanceOf[js.Any]).asInstanceOf[ULID_]
  
  inline def incrementBase32(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("incrementBase32")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def monotonicFactory(): ULID_ = ^.asInstanceOf[js.Dynamic].applyDynamic("monotonicFactory")().asInstanceOf[ULID_]
  inline def monotonicFactory(currPrng: PRNG): ULID_ = ^.asInstanceOf[js.Dynamic].applyDynamic("monotonicFactory")(currPrng.asInstanceOf[js.Any]).asInstanceOf[ULID_]
  
  inline def randomChar(prng: PRNG): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomChar")(prng.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def replaceCharAt(str: String, index: Double, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceCharAt")(str.asInstanceOf[js.Any], index.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ulid", "ulid")
  @js.native
  val ulid: ULID_ = js.native
  
  trait LibError
    extends StObject
       with Error {
    
    var source: String
  }
  object LibError {
    
    inline def apply(message: String, name: String, source: String): LibError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LibError] (val x: Self) extends AnyVal {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type PRNG = js.Function0[Double]
  
  type ULID_ = js.Function1[/* seedTime */ js.UndefOr[Double], String]
}
