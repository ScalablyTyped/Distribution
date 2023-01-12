package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStats extends StObject {
  
  var atime: js.Date
  
  var atimeMs: Double | js.BigInt
  
  var birthtime: js.Date
  
  var birthtimeMs: Double | js.BigInt
  
  var blksize: Double | js.BigInt
  
  var blocks: Double | js.BigInt
  
  var ctime: js.Date
  
  var ctimeMs: Double | js.BigInt
  
  var dev: Double | js.BigInt
  
  var gid: Double | js.BigInt
  
  var ino: Double | js.BigInt
  
  def isBlockDevice(): Boolean
  
  def isCharacterDevice(): Boolean
  
  def isDirectory(): Boolean
  
  def isFIFO(): Boolean
  
  def isFile(): Boolean
  
  def isSocket(): Boolean
  
  def isSymbolicLink(): Boolean
  
  var mode: Double | js.BigInt
  
  var mtime: js.Date
  
  var mtimeMs: Double | js.BigInt
  
  var nlink: Double | js.BigInt
  
  var rdev: Double | js.BigInt
  
  var size: Double | js.BigInt
  
  var uid: Double | js.BigInt
}
object IStats {
  
  inline def apply(
    atime: js.Date,
    atimeMs: Double | js.BigInt,
    birthtime: js.Date,
    birthtimeMs: Double | js.BigInt,
    blksize: Double | js.BigInt,
    blocks: Double | js.BigInt,
    ctime: js.Date,
    ctimeMs: Double | js.BigInt,
    dev: Double | js.BigInt,
    gid: Double | js.BigInt,
    ino: Double | js.BigInt,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: Double | js.BigInt,
    mtime: js.Date,
    mtimeMs: Double | js.BigInt,
    nlink: Double | js.BigInt,
    rdev: Double | js.BigInt,
    size: Double | js.BigInt,
    uid: Double | js.BigInt
  ): IStats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStats] (val x: Self) extends AnyVal {
    
    inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
    
    inline def setAtimeMs(value: Double | js.BigInt): Self = StObject.set(x, "atimeMs", value.asInstanceOf[js.Any])
    
    inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
    
    inline def setBirthtimeMs(value: Double | js.BigInt): Self = StObject.set(x, "birthtimeMs", value.asInstanceOf[js.Any])
    
    inline def setBlksize(value: Double | js.BigInt): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
    
    inline def setBlocks(value: Double | js.BigInt): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    inline def setCtimeMs(value: Double | js.BigInt): Self = StObject.set(x, "ctimeMs", value.asInstanceOf[js.Any])
    
    inline def setDev(value: Double | js.BigInt): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setGid(value: Double | js.BigInt): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setIno(value: Double | js.BigInt): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
    
    inline def setIsBlockDevice(value: () => Boolean): Self = StObject.set(x, "isBlockDevice", js.Any.fromFunction0(value))
    
    inline def setIsCharacterDevice(value: () => Boolean): Self = StObject.set(x, "isCharacterDevice", js.Any.fromFunction0(value))
    
    inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
    
    inline def setIsFIFO(value: () => Boolean): Self = StObject.set(x, "isFIFO", js.Any.fromFunction0(value))
    
    inline def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
    
    inline def setIsSocket(value: () => Boolean): Self = StObject.set(x, "isSocket", js.Any.fromFunction0(value))
    
    inline def setIsSymbolicLink(value: () => Boolean): Self = StObject.set(x, "isSymbolicLink", js.Any.fromFunction0(value))
    
    inline def setMode(value: Double | js.BigInt): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeMs(value: Double | js.BigInt): Self = StObject.set(x, "mtimeMs", value.asInstanceOf[js.Any])
    
    inline def setNlink(value: Double | js.BigInt): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
    
    inline def setRdev(value: Double | js.BigInt): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double | js.BigInt): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUid(value: Double | js.BigInt): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
