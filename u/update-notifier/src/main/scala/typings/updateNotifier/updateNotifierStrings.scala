package typings.updateNotifier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object updateNotifierStrings {
  @js.native
  sealed trait build extends js.Object
  
  @js.native
  sealed trait latest extends js.Object
  
  @js.native
  sealed trait major extends js.Object
  
  @js.native
  sealed trait minor extends js.Object
  
  @js.native
  sealed trait patch extends js.Object
  
  @js.native
  sealed trait prerelease extends js.Object
  
  @scala.inline
  def build: build = "build".asInstanceOf[build]
  @scala.inline
  def latest: latest = "latest".asInstanceOf[latest]
  @scala.inline
  def major: major = "major".asInstanceOf[major]
  @scala.inline
  def minor: minor = "minor".asInstanceOf[minor]
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  @scala.inline
  def prerelease: prerelease = "prerelease".asInstanceOf[prerelease]
}

