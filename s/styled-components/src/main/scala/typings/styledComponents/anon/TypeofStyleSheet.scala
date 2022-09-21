package typings.styledComponents.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.styledComponents.distSheetMod.default
import typings.styledComponents.distSheetSheetMod.GlobalStylesAllocationMap
import typings.styledComponents.distSheetSheetMod.NamesAllocationMap
import typings.styledComponents.distSheetSheetMod.SheetConstructorArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStyleSheet
  extends StObject
     with Instantiable0[default]
     with Instantiable1[/* options */ SheetConstructorArgs, default]
     with Instantiable2[
      (/* options */ SheetConstructorArgs) | (/* options */ Unit), 
      /* globalStyles */ GlobalStylesAllocationMap, 
      default
    ]
     with Instantiable3[
      (/* options */ SheetConstructorArgs) | (/* options */ Unit), 
      (/* globalStyles */ GlobalStylesAllocationMap) | (/* globalStyles */ Unit), 
      /* names */ NamesAllocationMap, 
      default
    ] {
  
  /** Register a group ID to give it an index */
  def registerId(id: String): Double = js.native
}
