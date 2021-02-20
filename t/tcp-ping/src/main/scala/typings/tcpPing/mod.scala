package typings.tcpPing

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tcp-ping", "ping")
  @js.native
  def ping(options: Options, callback: js.Function2[/* error */ Error, /* result */ Result, Unit]): Unit = js.native
  
  @JSImport("tcp-ping", "probe")
  @js.native
  def probe(
    address: String,
    port: Double,
    callback: js.Function2[/* error */ Error, /* result */ Boolean, Unit]
  ): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    var address: js.UndefOr[String] = js.native
    
    var attempts: js.UndefOr[Double] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttemptsUndefined: Self = StObject.set(x, "attempts", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    var address: String = js.native
    
    var attempts: Double = js.native
    
    var avg: Double = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var port: Double = js.native
    
    var results: js.Array[Results] = js.native
  }
  object Result {
    
    @scala.inline
    def apply(
      address: String,
      attempts: Double,
      avg: Double,
      max: Double,
      min: Double,
      port: Double,
      results: js.Array[Results]
    ): Result = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], attempts = attempts.asInstanceOf[js.Any], avg = avg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttempts(value: Double): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvg(value: Double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: js.Array[Results]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: Results*): Self = StObject.set(x, "results", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Results extends StObject {
    
    var error: js.UndefOr[Error] = js.native
    
    var seq: js.UndefOr[Double] = js.native
    
    var time: js.UndefOr[Double] = js.native
  }
  object Results {
    
    @scala.inline
    def apply(): Results = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Results]
    }
    
    @scala.inline
    implicit class ResultsMutableBuilder[Self <: Results] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setSeq(value: Double): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeqUndefined: Self = StObject.set(x, "seq", js.undefined)
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
