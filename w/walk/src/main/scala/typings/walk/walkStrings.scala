package typings.walk

import typings.walk.mod.WalkStatArrayEvent
import typings.walk.mod.WalkStatEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkStrings {
  
  @js.native
  sealed trait FIFO extends StObject
  inline def FIFO: FIFO = "FIFO".asInstanceOf[FIFO]
  
  @js.native
  sealed trait blockDevice extends StObject
  inline def blockDevice: blockDevice = "blockDevice".asInstanceOf[blockDevice]
  
  @js.native
  sealed trait characterDevice extends StObject
  inline def characterDevice: characterDevice = "characterDevice".asInstanceOf[characterDevice]
  
  @js.native
  sealed trait directories
    extends StObject
       with WalkStatArrayEvent
  inline def directories: directories = "directories".asInstanceOf[directories]
  
  @js.native
  sealed trait directory
    extends StObject
       with WalkStatEvent
  inline def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait directoryError
    extends StObject
       with WalkStatArrayEvent
  inline def directoryError: directoryError = "directoryError".asInstanceOf[directoryError]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait errors
    extends StObject
       with WalkStatArrayEvent
  inline def errors: errors = "errors".asInstanceOf[errors]
  
  @js.native
  sealed trait file
    extends StObject
       with WalkStatEvent
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait files
    extends StObject
       with WalkStatArrayEvent
  inline def files: files = "files".asInstanceOf[files]
  
  @js.native
  sealed trait names extends StObject
  inline def names: names = "names".asInstanceOf[names]
  
  @js.native
  sealed trait nodeError
    extends StObject
       with WalkStatArrayEvent
  inline def nodeError: nodeError = "nodeError".asInstanceOf[nodeError]
  
  @js.native
  sealed trait socket extends StObject
  inline def socket: socket = "socket".asInstanceOf[socket]
  
  @js.native
  sealed trait symbolicLink extends StObject
  inline def symbolicLink: symbolicLink = "symbolicLink".asInstanceOf[symbolicLink]
}
