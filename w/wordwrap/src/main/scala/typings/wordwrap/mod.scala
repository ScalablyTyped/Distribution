package typings.wordwrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Pad out lines with spaces out to column `start` and then wrap until column
    * `stop`. If a word is longer than `stop - start` characters it will overflow.
    */
  inline def apply(params: Options): Wrap = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[Wrap]
  /**
    * Pad out lines with spaces out to column `start` and then wrap until column
    * `stop`. If a word is longer than `stop - start` characters it will overflow.
    */
  inline def apply(start: Double, stop: Double): Wrap = (^.asInstanceOf[js.Dynamic].apply(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Wrap]
  inline def apply(start: Double, stop: Double, params: typings.wordwrap.anon.Mode): Wrap = (^.asInstanceOf[js.Dynamic].apply(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Wrap]
  /**
    * Wrap lines until column `stop`. If a word is longer than `stop` characters
    * it will overflow.
    */
  inline def apply(stop: Double): Wrap = ^.asInstanceOf[js.Dynamic].apply(stop.asInstanceOf[js.Any]).asInstanceOf[Wrap]
  inline def apply(stop: Double, params: typings.wordwrap.anon.Mode): Wrap = (^.asInstanceOf[js.Dynamic].apply(stop.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Wrap]
  
  @JSImport("wordwrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Wrap lines until column `stop`. Break up chunks longer than `stop - start`.
    */
  inline def hard(start: Double, stop: Double): Wrap = (^.asInstanceOf[js.Dynamic].applyDynamic("hard")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Wrap]
  /**
    * Wrap lines until column `stop`. Break up chunks longer than `stop`.
    */
  inline def hard(stop: Double): Wrap = ^.asInstanceOf[js.Dynamic].applyDynamic("hard")(stop.asInstanceOf[js.Any]).asInstanceOf[Wrap]
  
  // tslint:disable-line:unified-signatures
  /**
    * In "soft" mode, split chunks by `/(\S+\s+/` and don't break up chunks
    * which are longer than `stop - start`, in "hard" mode, split chunks with
    * `/\b/` and break up chunks longer than `stop - start`.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.wordwrap.wordwrapStrings.soft
    - typings.wordwrap.wordwrapStrings.hard
  */
  trait Mode extends StObject
  object Mode {
    
    inline def hard: typings.wordwrap.wordwrapStrings.hard = "hard".asInstanceOf[typings.wordwrap.wordwrapStrings.hard]
    
    inline def soft: typings.wordwrap.wordwrapStrings.soft = "soft".asInstanceOf[typings.wordwrap.wordwrapStrings.soft]
  }
  
  trait Options extends StObject {
    
    var mode: js.UndefOr[Mode] = js.undefined
    
    var start: Double
    
    var stop: Double
  }
  object Options {
    
    inline def apply(start: Double, stop: Double): Options = {
      val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStop(value: Double): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
  
  type Wrap = js.Function1[/* text */ String, String]
}
