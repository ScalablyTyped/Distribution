package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.Instantiable6
import typings.tizenCommonWeb.tizenCommonWebStrings.GROUP
import typings.tizenCommonWeb.tizenCommonWebStrings.SINGLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationControlConstructor
  extends StObject
     with Instantiable6[
      /* operation */ String, 
      /* uri */ js.UndefOr[String], 
      /* mime */ js.UndefOr[String], 
      /* category */ js.UndefOr[String], 
      /* data */ js.UndefOr[js.Array[ApplicationControlData]], 
      /* launchMode */ js.UndefOr[ApplicationControlLaunchMode | SINGLE | GROUP], 
      ApplicationControl
    ]
