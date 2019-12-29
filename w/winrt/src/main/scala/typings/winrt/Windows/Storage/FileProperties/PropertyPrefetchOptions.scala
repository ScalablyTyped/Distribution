package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyPrefetchOptions extends js.Object

@JSGlobal("Windows.Storage.FileProperties.PropertyPrefetchOptions")
@js.native
object PropertyPrefetchOptions extends js.Object {
  @js.native
  sealed trait basicProperties extends PropertyPrefetchOptions
  
  @js.native
  sealed trait documentProperties extends PropertyPrefetchOptions
  
  @js.native
  sealed trait imageProperties extends PropertyPrefetchOptions
  
  @js.native
  sealed trait musicProperties extends PropertyPrefetchOptions
  
  @js.native
  sealed trait none extends PropertyPrefetchOptions
  
  @js.native
  sealed trait videoProperties extends PropertyPrefetchOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertyPrefetchOptions with Double] = js.native
  /* 5 */ @js.native
  object basicProperties extends TopLevel[basicProperties with Double]
  
  /* 4 */ @js.native
  object documentProperties extends TopLevel[documentProperties with Double]
  
  /* 3 */ @js.native
  object imageProperties extends TopLevel[imageProperties with Double]
  
  /* 1 */ @js.native
  object musicProperties extends TopLevel[musicProperties with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object videoProperties extends TopLevel[videoProperties with Double]
  
}

