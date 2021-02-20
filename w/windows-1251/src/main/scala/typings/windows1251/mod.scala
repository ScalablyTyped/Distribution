package typings.windows1251

import typings.windows1251.anon.Mode
import typings.windows1251.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("windows-1251", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("windows-1251", "decode")
  @js.native
  def decode(text: String): String = js.native
  @JSImport("windows-1251", "decode")
  @js.native
  def decode(text: String, options: `0`): String = js.native
  
  @JSImport("windows-1251", "encode")
  @js.native
  def encode(input: String): String = js.native
  @JSImport("windows-1251", "encode")
  @js.native
  def encode(input: String, options: Mode): String = js.native
  
  @JSImport("windows-1251", "labels")
  @js.native
  def labels: js.Array[String] = js.native
  @scala.inline
  def labels_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labels")(x.asInstanceOf[js.Any])
  
  @JSImport("windows-1251", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - typings.windows1251.windows1251Strings.replacement
    - typings.windows1251.windows1251Strings.fatal
  */
  trait DecoderMode extends StObject
  object DecoderMode {
    
    @scala.inline
    def fatal: typings.windows1251.windows1251Strings.fatal = "fatal".asInstanceOf[typings.windows1251.windows1251Strings.fatal]
    
    @scala.inline
    def replacement: typings.windows1251.windows1251Strings.replacement = "replacement".asInstanceOf[typings.windows1251.windows1251Strings.replacement]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.windows1251.windows1251Strings.fatal
    - typings.windows1251.windows1251Strings.html
  */
  trait EncoderMode extends StObject
  object EncoderMode {
    
    @scala.inline
    def fatal: typings.windows1251.windows1251Strings.fatal = "fatal".asInstanceOf[typings.windows1251.windows1251Strings.fatal]
    
    @scala.inline
    def html: typings.windows1251.windows1251Strings.html = "html".asInstanceOf[typings.windows1251.windows1251Strings.html]
  }
  
  @js.native
  trait windows1251 extends StObject {
    
    def decode(text: String): String = js.native
    def decode(text: String, options: `0`): String = js.native
    
    def encode(input: String): String = js.native
    def encode(input: String, options: Mode): String = js.native
  }
}
