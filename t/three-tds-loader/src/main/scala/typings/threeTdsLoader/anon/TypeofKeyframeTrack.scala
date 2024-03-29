package typings.threeTdsLoader.anon

import org.scalablytyped.runtime.Instantiable3
import typings.std.ArrayLike
import typings.three.mod.KeyframeTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofKeyframeTrack
  extends StObject
     with Instantiable3[
      /* name */ String, 
      /* times */ ArrayLike[Double], 
      /* values */ ArrayLike[Any], 
      KeyframeTrack
    ] {
  
  def toJSON(track: typings.three.srcAnimationKeyframeTrackMod.KeyframeTrack): Any = js.native
}
