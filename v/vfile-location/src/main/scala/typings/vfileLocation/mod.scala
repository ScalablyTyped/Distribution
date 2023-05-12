package typings.vfileLocation

import typings.vfileLocation.libMod.VFile
import typings.vfileLocation.libMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vfile-location", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def location(file: VFile): typings.vfileLocation.libMod.Location_ = ^.asInstanceOf[js.Dynamic].applyDynamic("location")(file.asInstanceOf[js.Any]).asInstanceOf[typings.vfileLocation.libMod.Location_]
  inline def location(file: Value): typings.vfileLocation.libMod.Location_ = ^.asInstanceOf[js.Dynamic].applyDynamic("location")(file.asInstanceOf[js.Any]).asInstanceOf[typings.vfileLocation.libMod.Location_]
  
  type Location_ = typings.vfileLocation.libMod.Location_
}
