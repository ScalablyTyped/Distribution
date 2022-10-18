package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailingSince extends StObject {
  
  var build: BuildReference
  
  var date: js.Date
  
  var release: ReleaseReference
}
object FailingSince {
  
  inline def apply(build: BuildReference, date: js.Date, release: ReleaseReference): FailingSince = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailingSince]
  }
  
  extension [Self <: FailingSince](x: Self) {
    
    inline def setBuild(value: BuildReference): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: ReleaseReference): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
