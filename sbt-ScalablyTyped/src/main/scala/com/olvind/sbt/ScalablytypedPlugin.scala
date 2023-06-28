
package org.scalablytyped.sbt

import sbt._
import sbt.Keys._

@deprecated("The pre-built distribution you're using of ScalablyTyped is deprecated. Please see https://www.scalablytyped.org for the new sbt plugin", "2020-04-19")
object ScalablyTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin
  object autoImport {
    object ScalablyTyped {

    }
  }
}