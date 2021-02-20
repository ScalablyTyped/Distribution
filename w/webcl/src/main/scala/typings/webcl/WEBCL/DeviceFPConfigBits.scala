package typings.webcl.WEBCL

import typings.webcl.webclNumbers.`0x10`
import typings.webcl.webclNumbers.`0x1`
import typings.webcl.webclNumbers.`0x20`
import typings.webcl.webclNumbers.`0x2`
import typings.webcl.webclNumbers.`0x40`
import typings.webcl.webclNumbers.`0x4`
import typings.webcl.webclNumbers.`0x8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* cl_device_fp_config - bitfield */
/* Rewritten from type alias, can be one of: 
  - typings.webcl.webclNumbers.`0x1`
  - typings.webcl.webclNumbers.`0x2`
  - typings.webcl.webclNumbers.`0x4`
  - typings.webcl.webclNumbers.`0x8`
  - typings.webcl.webclNumbers.`0x10`
  - typings.webcl.webclNumbers.`0x20`
  - typings.webcl.webclNumbers.`0x40`
*/
trait DeviceFPConfigBits extends StObject
object DeviceFPConfigBits {
  
  @scala.inline
  def FP_DENORM: `0x1` = 0x1.asInstanceOf[`0x1`]
  
  @scala.inline
  def FP_FMA: `0x20` = 0x20.asInstanceOf[`0x20`]
  
  @scala.inline
  def FP_INF_NAN: `0x2` = 0x2.asInstanceOf[`0x2`]
  
  @scala.inline
  def FP_ROUND_TO_INF: `0x10` = 0x10.asInstanceOf[`0x10`]
  
  @scala.inline
  def FP_ROUND_TO_NEAREST: `0x4` = 0x4.asInstanceOf[`0x4`]
  
  @scala.inline
  def FP_ROUND_TO_ZERO: `0x8` = 0x8.asInstanceOf[`0x8`]
  
  @scala.inline
  def FP_SOFT_FLOAT: `0x40` = 0x40.asInstanceOf[`0x40`]
}
