package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFilterConstructor
  extends StObject
     with Instantiable1[/* contentType */ MediaControllerContentType, SearchFilter]
     with Instantiable2[
      /* contentType */ MediaControllerContentType, 
      /* category */ MediaControllerSearchCategory, 
      SearchFilter
    ]
     with Instantiable3[
      /* contentType */ MediaControllerContentType, 
      (/* category */ MediaControllerSearchCategory) | (/* category */ Unit), 
      /* keyword */ String, 
      SearchFilter
    ]
     with Instantiable4[
      /* contentType */ MediaControllerContentType, 
      (/* category */ MediaControllerSearchCategory) | (/* category */ Unit), 
      (/* keyword */ Null) | (/* keyword */ String) | (/* keyword */ Unit), 
      /* extraData */ Bundle, 
      SearchFilter
    ]
