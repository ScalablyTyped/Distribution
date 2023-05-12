package typings.webdriver.anon

import org.scalablytyped.runtime.Instantiable0
import typings.webdriver.buildTypesMod.AttachOptions
import typings.webdriver.buildTypesMod.Client
import typings.webdriver.mod.WebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofWebDriver
  extends StObject
     with Instantiable0[WebDriver] {
  
  def WebDriver: /* import warning: importer.ImportType#apply Failed type conversion: typeof WebDriver */ js.Any = js.native
  
  /**
    * allows user to attach to existing sessions
    */
  def attachToSession(): Client = js.native
  def attachToSession(options: Unit, modifier: js.Function1[/* repeated */ Any, Any]): Client = js.native
  def attachToSession(options: Unit, modifier: js.Function1[/* repeated */ Any, Any], userPrototype: js.Object): Client = js.native
  def attachToSession(
    options: Unit,
    modifier: js.Function1[/* repeated */ Any, Any],
    userPrototype: js.Object,
    commandWrapper: js.Function1[/* repeated */ Any, Any]
  ): Client = js.native
  def attachToSession(
    options: Unit,
    modifier: js.Function1[/* repeated */ Any, Any],
    userPrototype: Unit,
    commandWrapper: js.Function1[/* repeated */ Any, Any]
  ): Client = js.native
  def attachToSession(options: Unit, modifier: Unit, userPrototype: js.Object): Client = js.native
  def attachToSession(
    options: Unit,
    modifier: Unit,
    userPrototype: js.Object,
    commandWrapper: js.Function1[/* repeated */ Any, Any]
  ): Client = js.native
  def attachToSession(
    options: Unit,
    modifier: Unit,
    userPrototype: Unit,
    commandWrapper: js.Function1[/* repeated */ Any, Any]
  ): Client = js.native
  def attachToSession(options: AttachOptions): Client = js.native
  def attachToSession(options: AttachOptions, modifier: js.Function1[/* repeated */ Any, Any]): Client = js.native
  def attachToSession(options: AttachOptions, modifier: js.Function1[/* repeated */ Any, Any], userPrototype: js.Object): Client = js.native
  def attachToSession(
    options: AttachOptions,
    modifier: js.Function1[/* repeated */ Any, Any],
    userPrototype: js.Object,
    commandWrapper: js.Function1[/* repeated */ Any, Any]
  ): Client = js.native
  def attachToSession(
    options: AttachOptions,
    modifier: js.Function1[/* repeated */ Any, Any],
    userPrototype: Unit,
    commandWrapper: js.Function1[/* repeated */ Any, Any]
  ): Client = js.native
  def attachToSession(options: AttachOptions, modifier: Unit, userPrototype: js.Object): Client = js.native
  def attachToSession(
    options: AttachOptions,
    modifier: Unit,
    userPrototype: js.Object,
    commandWrapper: js.Function1[/* repeated */ Any, Any]
  ): Client = js.native
  def attachToSession(
    options: AttachOptions,
    modifier: Unit,
    userPrototype: Unit,
    commandWrapper: js.Function1[/* repeated */ Any, Any]
  ): Client = js.native
  
  def newSession(options: typings.wdioTypes.buildOptionsMod.WebDriver): js.Promise[Client] = js.native
  def newSession(
    options: typings.wdioTypes.buildOptionsMod.WebDriver,
    modifier: js.Function1[/* repeated */ Any, Any]
  ): js.Promise[Client] = js.native
  def newSession(
    options: typings.wdioTypes.buildOptionsMod.WebDriver,
    modifier: js.Function1[/* repeated */ Any, Any],
    userPrototype: js.Object
  ): js.Promise[Client] = js.native
  def newSession(
    options: typings.wdioTypes.buildOptionsMod.WebDriver,
    modifier: js.Function1[/* repeated */ Any, Any],
    userPrototype: js.Object,
    customCommandWrapper: js.Function1[/* repeated */ Any, Any]
  ): js.Promise[Client] = js.native
  def newSession(
    options: typings.wdioTypes.buildOptionsMod.WebDriver,
    modifier: js.Function1[/* repeated */ Any, Any],
    userPrototype: Unit,
    customCommandWrapper: js.Function1[/* repeated */ Any, Any]
  ): js.Promise[Client] = js.native
  def newSession(options: typings.wdioTypes.buildOptionsMod.WebDriver, modifier: Unit, userPrototype: js.Object): js.Promise[Client] = js.native
  def newSession(
    options: typings.wdioTypes.buildOptionsMod.WebDriver,
    modifier: Unit,
    userPrototype: js.Object,
    customCommandWrapper: js.Function1[/* repeated */ Any, Any]
  ): js.Promise[Client] = js.native
  def newSession(
    options: typings.wdioTypes.buildOptionsMod.WebDriver,
    modifier: Unit,
    userPrototype: Unit,
    customCommandWrapper: js.Function1[/* repeated */ Any, Any]
  ): js.Promise[Client] = js.native
  
  /**
    * Changes The instance session id and browser capabilities for the new session
    * directly into the passed in browser object
    *
    * @param   {object} instance  the object we get from a new browser session.
    * @returns {string}           the new session id of the browser
    */
  def reloadSession(instance: Client): js.Promise[String] = js.native
}
