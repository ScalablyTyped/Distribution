package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TZDateConstructor
  extends StObject
     with Instantiable0[TZDate]
     with Instantiable1[/* datetime */ js.Date, TZDate]
     with Instantiable2[
      (/* datetime */ js.Date) | (/* datetime */ Null) | (/* datetime */ Unit), 
      /* timezone */ String, 
      TZDate
    ]
     with Instantiable8[
      /* year */ Double, 
      /* month */ Double, 
      /* day */ Double, 
      /* hours */ js.UndefOr[Double | Null], 
      /* minutes */ js.UndefOr[Double | Null], 
      /* seconds */ js.UndefOr[Double | Null], 
      /* milliseconds */ js.UndefOr[Double | Null], 
      /* timezone */ js.UndefOr[String | Null], 
      TZDate
    ]
