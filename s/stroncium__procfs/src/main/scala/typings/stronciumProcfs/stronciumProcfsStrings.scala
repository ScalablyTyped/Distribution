package typings.stronciumProcfs

import typings.stronciumProcfs.mod.DeviceType
import typings.stronciumProcfs.mod.ProcessFdType
import typings.stronciumProcfs.mod.ProcessFdinfoType
import typings.stronciumProcfs.mod.ProcessState
import typings.stronciumProcfs.mod.ProcfsErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stronciumProcfsStrings {
  
  @js.native
  sealed trait D
    extends StObject
       with ProcessState
  inline def D: D = "D".asInstanceOf[D]
  
  @js.native
  sealed trait ENOENT
    extends StObject
       with ProcfsErrorCode
  inline def ENOENT: ENOENT = "ENOENT".asInstanceOf[ENOENT]
  
  @js.native
  sealed trait EPARSE
    extends StObject
       with ProcfsErrorCode
  inline def EPARSE: EPARSE = "EPARSE".asInstanceOf[EPARSE]
  
  @js.native
  sealed trait EUNKNOWN
    extends StObject
       with ProcfsErrorCode
  inline def EUNKNOWN: EUNKNOWN = "EUNKNOWN".asInstanceOf[EUNKNOWN]
  
  @js.native
  sealed trait R
    extends StObject
       with ProcessState
  inline def R: R = "R".asInstanceOf[R]
  
  @js.native
  sealed trait S
    extends StObject
       with ProcessState
  inline def S: S = "S".asInstanceOf[S]
  
  @js.native
  sealed trait T
    extends StObject
       with ProcessState
  inline def T: T = "T".asInstanceOf[T]
  
  @js.native
  sealed trait X
    extends StObject
       with ProcessState
  inline def X: X = "X".asInstanceOf[X]
  
  @js.native
  sealed trait Z
    extends StObject
       with ProcessState
  inline def Z: Z = "Z".asInstanceOf[Z]
  
  @js.native
  sealed trait `anon-inode`
    extends StObject
       with ProcessFdType
  inline def `anon-inode`: `anon-inode` = "anon-inode".asInstanceOf[`anon-inode`]
  
  @js.native
  sealed trait block
    extends StObject
       with DeviceType
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait character
    extends StObject
       with DeviceType
  inline def character: character = "character".asInstanceOf[character]
  
  @js.native
  sealed trait epoll
    extends StObject
       with ProcessFdinfoType
  inline def epoll: epoll = "epoll".asInstanceOf[epoll]
  
  @js.native
  sealed trait event
    extends StObject
       with ProcessFdinfoType
  inline def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait fanotify
    extends StObject
       with ProcessFdinfoType
  inline def fanotify: fanotify = "fanotify".asInstanceOf[fanotify]
  
  @js.native
  sealed trait file
    extends StObject
       with ProcessFdType
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait inotify
    extends StObject
       with ProcessFdinfoType
  inline def inotify: inotify = "inotify".asInstanceOf[inotify]
  
  @js.native
  sealed trait pipe
    extends StObject
       with ProcessFdType
  inline def pipe: pipe = "pipe".asInstanceOf[pipe]
  
  @js.native
  sealed trait regular
    extends StObject
       with ProcessFdinfoType
  inline def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait signal
    extends StObject
       with ProcessFdinfoType
  inline def signal: signal = "signal".asInstanceOf[signal]
  
  @js.native
  sealed trait socket
    extends StObject
       with ProcessFdType
  inline def socket: socket = "socket".asInstanceOf[socket]
  
  @js.native
  sealed trait t_
    extends StObject
       with ProcessState
  inline def t_ : t_ = "t".asInstanceOf[t_]
  
  @js.native
  sealed trait timer
    extends StObject
       with ProcessFdinfoType
  inline def timer: timer = "timer".asInstanceOf[timer]
}
