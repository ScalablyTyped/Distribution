package typings.unixTime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Convert a date to a [unix timestamp](http://en.wikipedia.org/wiki/Unix_timestamp) because every
    * other analytics service under the sun seems to use this.
    *
    * @example
    * import unixTime = require('unix-time');
    *
    * unixTime(new Date()); // 1374016861
    */
  inline def apply(date: String): Double = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(date: Double): Double = ^.asInstanceOf[js.Dynamic].apply(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("unix-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
