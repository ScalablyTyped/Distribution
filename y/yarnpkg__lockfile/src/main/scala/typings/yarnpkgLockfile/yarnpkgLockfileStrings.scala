package typings.yarnpkgLockfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object yarnpkgLockfileStrings {
  @js.native
  sealed trait conflict extends js.Object
  
  @js.native
  sealed trait merge extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  @scala.inline
  def conflict: conflict = "conflict".asInstanceOf[conflict]
  @scala.inline
  def merge: merge = "merge".asInstanceOf[merge]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

