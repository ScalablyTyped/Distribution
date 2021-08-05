package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a source of timed text data. */
@JSGlobal("Windows.Media.Core.TimedTextSource")
@js.native
abstract class TimedTextSource ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.TimedTextSource
object TimedTextSource {
  
  @JSGlobal("Windows.Media.Core.TimedTextSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new instance of TimedTextSource from the provided stream.
    * @param stream The stream from which the timed text source is created.
    * @return The new timed text source.
    */
  /* static member */
  inline def createFromStream(stream: IRandomAccessStream): typings.winrtUwp.Windows.Media.Core.TimedTextSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.Core.TimedTextSource]
  /**
    * Creates a new instance of TimedTextSource with the specified default language from the provided stream.
    * @param stream The stream from which the timed text source is created.
    * @param defaultLanguage A string specifying the default language for the timed text source.
    * @return The new timed text source.
    */
  /* static member */
  inline def createFromStream(stream: IRandomAccessStream, defaultLanguage: String): typings.winrtUwp.Windows.Media.Core.TimedTextSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromStream")(stream.asInstanceOf[js.Any], defaultLanguage.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.Core.TimedTextSource]
  
  /**
    * Creates a new instance of TimedTextSource from the provided URI.
    * @param uri The URI from which the timed text source is created.
    * @return The new timed text source.
    */
  /* static member */
  inline def createFromUri(uri: Uri): typings.winrtUwp.Windows.Media.Core.TimedTextSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromUri")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Media.Core.TimedTextSource]
  /**
    * Creates a new instance of TimedTextSource with the specified default language from the provided URI.
    * @param uri The URI from which the timed text source is created.
    * @param defaultLanguage A string specifying the default language for the timed text source.
    * @return The new timed text source.
    */
  /* static member */
  inline def createFromUri(uri: Uri, defaultLanguage: String): typings.winrtUwp.Windows.Media.Core.TimedTextSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromUri")(uri.asInstanceOf[js.Any], defaultLanguage.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Media.Core.TimedTextSource]
}
