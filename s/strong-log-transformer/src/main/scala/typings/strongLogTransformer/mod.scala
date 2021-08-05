package typings.strongLogTransformer

import org.scalablytyped.runtime.Shortcut
import typings.node.NodeJS.ReadWriteStream
import typings.strongLogTransformer.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("strong-log-transformer", JSImport.Namespace)
  @js.native
  val ^ : StrongLogTransformer = js.native
  
  trait Options extends StObject {
    
    var format: String
    
    var mergeMultiline: Boolean
    
    var tag: String
    
    var timeStamp: Boolean
  }
  object Options {
    
    inline def apply(format: String, mergeMultiline: Boolean, tag: String, timeStamp: Boolean): Options = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], mergeMultiline = mergeMultiline.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setMergeMultiline(value: Boolean): Self = StObject.set(x, "mergeMultiline", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Boolean): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StrongLogTransformer extends StObject {
    
    def apply(): ReadWriteStream = js.native
    def apply(options: PartialOptions): ReadWriteStream = js.native
    
    var DEFAULTS: Options = js.native
    
    def cli(args: js.Array[String]): Unit = js.native
  }
  
  type _To = StrongLogTransformer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: StrongLogTransformer = ^
}
