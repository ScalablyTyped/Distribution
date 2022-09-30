package typings.upath2

import typings.upath2.typeMod.IPathPlatform
import typings.upath2.typeMod.IPathPlatformOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upath2Strings {
  
  @js.native
  sealed trait Colon extends StObject
  inline def Colon: Colon = ":".asInstanceOf[Colon]
  
  @js.native
  sealed trait Semicolon extends StObject
  inline def Semicolon: Semicolon = ";".asInstanceOf[Semicolon]
  
  @js.native
  sealed trait Slash extends StObject
  inline def Slash: Slash = "/".asInstanceOf[Slash]
  
  @js.native
  sealed trait node
    extends StObject
       with IPathPlatform
  inline def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait posix
    extends StObject
       with IPathPlatform
       with IPathPlatformOrigin
  inline def posix: posix = "posix".asInstanceOf[posix]
  
  @js.native
  sealed trait upath
    extends StObject
       with IPathPlatform
  inline def upath: upath = "upath".asInstanceOf[upath]
  
  @js.native
  sealed trait win32
    extends StObject
       with IPathPlatform
       with IPathPlatformOrigin
  inline def win32: win32 = "win32".asInstanceOf[win32]
}
