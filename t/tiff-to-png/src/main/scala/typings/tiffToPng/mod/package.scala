package typings.tiffToPng

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * The complete callback will be called when the conversion of the final TIFF has finished.
    */
  type CompleteCallback = js.Function2[
    /* errors */ js.Array[java.lang.String], 
    /* total */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  
  /**
    * The complete callback will be called when the conversion of the final TIFF has finished.
    */
  type ProgressCallback = js.Function2[
    /* converted */ js.Array[typings.tiffToPng.mod.Converted], 
    /* total */ scala.Double, 
    scala.Unit
  ]
}
