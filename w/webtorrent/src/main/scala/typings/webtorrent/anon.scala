package typings.webtorrent

import typings.std.File
import typings.webtorrent.mod.Torrent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Autoplay extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var controls: js.UndefOr[Boolean] = js.undefined
    
    var maxBlobLength: js.UndefOr[Double] = js.undefined
  }
  object Autoplay {
    
    inline def apply(): Autoplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Autoplay]
    }
    
    extension [Self <: Autoplay](x: Self) {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setMaxBlobLength(value: Double): Self = StObject.set(x, "maxBlobLength", value.asInstanceOf[js.Any])
      
      inline def setMaxBlobLengthUndefined: Self = StObject.set(x, "maxBlobLength", js.undefined)
    }
  }
  
  trait End extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object End {
    
    inline def apply(end: Double, start: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    extension [Self <: End](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Files extends StObject {
    
    var files: js.Array[File]
    
    var length: Double
    
    var torrent: Torrent
  }
  object Files {
    
    inline def apply(files: js.Array[File], length: Double, torrent: Torrent): Files = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Files]
    }
    
    extension [Self <: Files](x: Self) {
      
      inline def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setTorrent(value: Torrent): Self = StObject.set(x, "torrent", value.asInstanceOf[js.Any])
    }
  }
}
