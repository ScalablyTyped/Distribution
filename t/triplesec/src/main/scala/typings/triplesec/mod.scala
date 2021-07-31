package typings.triplesec

import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("triplesec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decrypt(arg: Arguments, cb: js.Function2[/* err */ Error | Null, /* buff */ Buffer | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(arg.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def encrypt(arg: Arguments, cb: js.Function2[/* err */ Error | Null, /* buff */ Buffer | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(arg.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object prng {
    
    @JSImport("triplesec", "prng")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def generate(n: Double, cb: js.Function1[/* words */ WordArray, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(n.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait Arguments extends StObject {
    
    var data: Buffer
    
    var key: Buffer
    
    var progress_hook: js.UndefOr[js.Function1[/* progress */ Progress, Unit]] = js.undefined
  }
  object Arguments {
    
    @scala.inline
    def apply(data: Buffer, key: Buffer): Arguments = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arguments]
    }
    
    @scala.inline
    implicit class ArgumentsMutableBuilder[Self <: Arguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress_hook(value: /* progress */ Progress => Unit): Self = StObject.set(x, "progress_hook", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProgress_hookUndefined: Self = StObject.set(x, "progress_hook", js.undefined)
    }
  }
  
  trait Progress extends StObject {
    
    var i: Double
    
    var total: Double
    
    var what: String
  }
  object Progress {
    
    @scala.inline
    def apply(i: Double, total: Double, what: String): Progress = {
      val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    @scala.inline
    implicit class ProgressMutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhat(value: String): Self = StObject.set(x, "what", value.asInstanceOf[js.Any])
    }
  }
  
  trait WordArray extends StObject {
    
    var sigBytes: Double
    
    def to_hex(): String
    
    var words: js.Array[Double]
  }
  object WordArray {
    
    @scala.inline
    def apply(sigBytes: Double, to_hex: () => String, words: js.Array[Double]): WordArray = {
      val __obj = js.Dynamic.literal(sigBytes = sigBytes.asInstanceOf[js.Any], to_hex = js.Any.fromFunction0(to_hex), words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[WordArray]
    }
    
    @scala.inline
    implicit class WordArrayMutableBuilder[Self <: WordArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSigBytes(value: Double): Self = StObject.set(x, "sigBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_hex(value: () => String): Self = StObject.set(x, "to_hex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWords(value: js.Array[Double]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordsVarargs(value: Double*): Self = StObject.set(x, "words", js.Array(value :_*))
    }
  }
}
