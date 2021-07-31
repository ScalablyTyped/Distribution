package typings.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.tizenCommonWeb.tizenCommonWebStrings.INTERSECTION
import typings.tizenCommonWeb.tizenCommonWebStrings.UNION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompositeFilterConstructor
  extends StObject
     with Instantiable1[INTERSECTION | UNION | (/* type */ CompositeFilterType), CompositeFilter]
     with Instantiable2[
      INTERSECTION | UNION | (/* type */ CompositeFilterType), 
      /* filters */ js.Array[AbstractFilter], 
      CompositeFilter
    ]
