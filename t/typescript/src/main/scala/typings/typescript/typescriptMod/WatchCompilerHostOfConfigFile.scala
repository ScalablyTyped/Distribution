package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Host to create watch with config file
  */
@js.native
trait WatchCompilerHostOfConfigFile[T /* <: BuilderProgram */]
  extends WatchCompilerHost[T]
     with ConfigFileDiagnosticsReporter {
  /** Name of the config file to compile */
  var configFileName: String = js.native
  /** Options to extend */
  var optionsToExtend: js.UndefOr[CompilerOptions] = js.native
  /**
    * Used to generate source file names from the config file and its include, exclude, files rules
    * and also to cache the directory stucture
    */
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: String): js.Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: String, extensions: js.Array[String]): js.Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: String, extensions: js.Array[String], exclude: js.Array[String]): js.Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(path: String, extensions: js.Array[String], exclude: js.Array[String], include: js.Array[String]): js.Array[String] = js.native
  @JSName("readDirectory")
  def readDirectory_MWatchCompilerHostOfConfigFile(
    path: String,
    extensions: js.Array[String],
    exclude: js.Array[String],
    include: js.Array[String],
    depth: Double
  ): js.Array[String] = js.native
}

