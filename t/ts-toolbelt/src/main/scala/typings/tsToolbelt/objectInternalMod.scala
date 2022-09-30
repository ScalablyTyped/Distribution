package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.tsToolbeltStrings.Exclamationmark
import typings.tsToolbelt.tsToolbeltStrings.Questionmark
import typings.tsToolbelt.tsToolbeltStrings.R
import typings.tsToolbelt.tsToolbeltStrings.W
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectInternalMod {
  
  type Anyfy[O /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: any}
    */ typings.tsToolbelt.tsToolbeltStrings.Anyfy & TopLevel[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsToolbelt.tsToolbeltStrings.flat
    - typings.tsToolbelt.tsToolbeltStrings.deep
  */
  trait Depth extends StObject
  object Depth {
    
    inline def deep: typings.tsToolbelt.tsToolbeltStrings.deep = "deep".asInstanceOf[typings.tsToolbelt.tsToolbeltStrings.deep]
    
    inline def flat: typings.tsToolbelt.tsToolbeltStrings.flat = "flat".asInstanceOf[typings.tsToolbelt.tsToolbeltStrings.flat]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsToolbelt.tsToolbeltInts.`0`
    - typings.tsToolbelt.tsToolbeltInts.`1`
    - typings.tsToolbelt.tsToolbeltInts.`2`
  */
  trait MergeStyle extends StObject
  object MergeStyle {
    
    inline def `0`: typings.tsToolbelt.tsToolbeltInts.`0` = 0.asInstanceOf[typings.tsToolbelt.tsToolbeltInts.`0`]
    
    inline def `1`: typings.tsToolbelt.tsToolbeltInts.`1` = 1.asInstanceOf[typings.tsToolbelt.tsToolbeltInts.`1`]
    
    inline def `2`: typings.tsToolbelt.tsToolbeltInts.`2` = 2.asInstanceOf[typings.tsToolbelt.tsToolbeltInts.`2`]
  }
  
  type Modx = js.Tuple2[Questionmark | Exclamationmark, W | R]
}
