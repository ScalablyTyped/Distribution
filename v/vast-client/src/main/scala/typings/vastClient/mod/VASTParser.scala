package typings.vastClient.mod

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Document
import typings.vastClient.anon.PickVastErrorERRORCODE
import typings.vastClient.anon.PickVastErrorExcludekeyof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vast-client", "VASTParser")
@js.native
class VASTParser () extends EventEmitter {
  def this(options: EventEmitterOptions) = this()
  
  /**
    * Add the replace function at the end of the URLTemplateFilters array.
    * All functions in URLTemplateFilters will be called with the VAST URL as parameter before fetching the VAST URL document.
    */
  def addURLTemplateFilter(cb: js.Function1[/* vastUrl */ String, String]): Unit = js.native
  
  /**
    * Reset URLTemplateFilters to empty, previous replace function set with addURLTemplateFilter() are no longer called.
    */
  def clearUrlTemplateFilters(): Unit = js.native
  
  /**
    * Returns how many replace function are set (ie: URLTemplateFilters length)
    */
  def countURLTemplateFilters(): Double = js.native
  
  /**
    * Fetches a VAST document for the given url.
    * Returns a Promise which resolves with the fetched xml or rejects with an error, according to the result of the request.
    */
  def fetchVAST(/**
    * The url to request the VAST document.
    */
  url: String): js.Promise[Document] = js.native
  def fetchVAST(
    /**
    * The url to request the VAST document.
    */
  url: String,
    /**
    * how many times the current url has been wrapped
    */
  wrapperDepth: Double
  ): js.Promise[Document] = js.native
  def fetchVAST(
    /**
    * The url to request the VAST document.
    */
  url: String,
    /**
    * how many times the current url has been wrapped
    */
  wrapperDepth: Double,
    /**
    * url of original wrapper
    */
  originalUrl: String
  ): js.Promise[Document] = js.native
  def fetchVAST(
    /**
    * The url to request the VAST document.
    */
  url: String,
    /**
    * how many times the current url has been wrapped
    */
  wrapperDepth: Unit,
    /**
    * url of original wrapper
    */
  originalUrl: String
  ): js.Promise[Document] = js.native
  
  /**
    * Fetches and parses a VAST for the given url.
    * Returns a Promise which resolves with a fully parsed VASTResponse or rejects with an Error.
    */
  def getAndParseVAST(/**
    * The url to request the VAST document.
    */
  url: String): js.Promise[VastResponse] = js.native
  def getAndParseVAST(
    /**
    * The url to request the VAST document.
    */
  url: String,
    /**
    * An optional Object of parameters to be used in the parsing process.
    */
  options: VastRequestOptions
  ): js.Promise[VastResponse] = js.native
  
  /**
    * Parses the given xml Object into a VASTResponse.
    * Returns a Promise which either resolves with the fully parsed VASTResponse or rejects with an Error.
    */
  def parseVAST(/**
    * A VAST XML document
    */
  vastXml: Document): js.Promise[VastResponse] = js.native
  def parseVAST(
    /**
    * A VAST XML document
    */
  vastXml: Document,
    /**
    * An optional Object of parameters to be used in the parsing process.
    */
  options: VastRequestOptions
  ): js.Promise[VastResponse] = js.native
  
  /**
    * Removes the last element of the url templates filters array.
    */
  def removeURLTemplateFilter(): Unit = js.native
  
  /**
    * Tracks the error provided in the errorCode parameter and emits a VAST-error event for the given error.
    */
  def trackVastError(
    /**
    * An Array of url templates to use to make the tracking call
    */
  urlTemplates: js.Array[String],
    errorCode: PickVastErrorERRORCODE,
    data: PickVastErrorExcludekeyof*
  ): Unit = js.native
  
  /**
    * util method for handling urls, it is used to make the requests.
    */
  var urlHandler: VASTClientUrlHandler = js.native
}
