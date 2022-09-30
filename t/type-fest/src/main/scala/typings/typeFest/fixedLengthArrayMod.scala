package typings.typeFest

import typings.std.Exclude
import typings.std.Pick
import typings.typeFest.anon.Dictindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fixedLengthArrayMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.typeFest.typeFestStrings.splice
    - typings.typeFest.typeFestStrings.push
    - typings.typeFest.typeFestStrings.pop
    - typings.typeFest.typeFestStrings.shift
    - typings.typeFest.typeFestStrings.unshift
  */
  trait ArrayLengthMutationKeys extends StObject
  object ArrayLengthMutationKeys {
    
    inline def pop: typings.typeFest.typeFestStrings.pop = "pop".asInstanceOf[typings.typeFest.typeFestStrings.pop]
    
    inline def push: typings.typeFest.typeFestStrings.push = "push".asInstanceOf[typings.typeFest.typeFestStrings.push]
    
    inline def shift: typings.typeFest.typeFestStrings.shift = "shift".asInstanceOf[typings.typeFest.typeFestStrings.shift]
    
    inline def splice: typings.typeFest.typeFestStrings.splice = "splice".asInstanceOf[typings.typeFest.typeFestStrings.splice]
    
    inline def unshift: typings.typeFest.typeFestStrings.unshift = "unshift".asInstanceOf[typings.typeFest.typeFestStrings.unshift]
  }
  
  type FixedLengthArray[Element, Length /* <: Double */, ArrayPrototype] = (Pick[
    ArrayPrototype, 
    Exclude[/* keyof ArrayPrototype */ String, ArrayLengthMutationKeys]
  ]) & (Dictindex[Element, Length])
}
