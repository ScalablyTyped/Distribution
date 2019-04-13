package typings
package webDashPushLib.webDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def encrypt(
    userPublicKey: java.lang.String,
    userAuth: java.lang.String,
    payload: java.lang.String,
    contentEncoding: ContentEncoding
  ): EncryptionResult = js.native
  def encrypt(
    userPublicKey: java.lang.String,
    userAuth: java.lang.String,
    payload: nodeLib.Buffer,
    contentEncoding: ContentEncoding
  ): EncryptionResult = js.native
  def generateRequestDetails(subscription: PushSubscription): RequestDetails = js.native
  def generateRequestDetails(subscription: PushSubscription, payload: java.lang.String): RequestDetails = js.native
  def generateRequestDetails(subscription: PushSubscription, payload: java.lang.String, options: RequestOptions): RequestDetails = js.native
  def generateRequestDetails(subscription: PushSubscription, payload: nodeLib.Buffer): RequestDetails = js.native
  def generateRequestDetails(subscription: PushSubscription, payload: nodeLib.Buffer, options: RequestOptions): RequestDetails = js.native
  def generateRequestDetails(subscription: PushSubscription, payload: scala.Null, options: RequestOptions): RequestDetails with webDashPushLib.Anon_Body = js.native
  @JSName("generateRequestDetails")
  def `generateRequestDetails_<intersection>`(subscription: PushSubscription): RequestDetails with webDashPushLib.Anon_Body = js.native
  @JSName("generateRequestDetails")
  def `generateRequestDetails_<intersection>`(subscription: PushSubscription, payload: java.lang.String): RequestDetails with webDashPushLib.Anon_BodyBuffer = js.native
  @JSName("generateRequestDetails")
  def `generateRequestDetails_<intersection>`(subscription: PushSubscription, payload: java.lang.String, options: RequestOptions): RequestDetails with webDashPushLib.Anon_BodyBuffer = js.native
  @JSName("generateRequestDetails")
  def `generateRequestDetails_<intersection>`(subscription: PushSubscription, payload: nodeLib.Buffer): RequestDetails with webDashPushLib.Anon_BodyBuffer = js.native
  @JSName("generateRequestDetails")
  def `generateRequestDetails_<intersection>`(subscription: PushSubscription, payload: nodeLib.Buffer, options: RequestOptions): RequestDetails with webDashPushLib.Anon_BodyBuffer = js.native
  def generateVAPIDKeys(): VapidKeys = js.native
  def getVapidHeaders(
    audience: java.lang.String,
    subject: java.lang.String,
    publicKey: java.lang.String,
    privateKey: java.lang.String,
    contentEncoding: ContentEncoding
  ): webDashPushLib.Anon_AuthorizationCryptoKeyString = js.native
  def getVapidHeaders(
    audience: java.lang.String,
    subject: java.lang.String,
    publicKey: java.lang.String,
    privateKey: java.lang.String,
    contentEncoding: ContentEncoding,
    expiration: scala.Double
  ): webDashPushLib.Anon_AuthorizationCryptoKeyString = js.native
  @JSName("getVapidHeaders")
  def getVapidHeaders_aes128gcm(
    audience: java.lang.String,
    subject: java.lang.String,
    publicKey: java.lang.String,
    privateKey: java.lang.String,
    contentEncoding: webDashPushLib.webDashPushLibStrings.aes128gcm
  ): webDashPushLib.Anon_Authorization = js.native
  @JSName("getVapidHeaders")
  def getVapidHeaders_aes128gcm(
    audience: java.lang.String,
    subject: java.lang.String,
    publicKey: java.lang.String,
    privateKey: java.lang.String,
    contentEncoding: webDashPushLib.webDashPushLibStrings.aes128gcm,
    expiration: scala.Double
  ): webDashPushLib.Anon_Authorization = js.native
  @JSName("getVapidHeaders")
  def getVapidHeaders_aesgcm(
    audience: java.lang.String,
    subject: java.lang.String,
    publicKey: java.lang.String,
    privateKey: java.lang.String,
    contentEncoding: webDashPushLib.webDashPushLibStrings.aesgcm
  ): webDashPushLib.Anon_AuthorizationCryptoKey = js.native
  @JSName("getVapidHeaders")
  def getVapidHeaders_aesgcm(
    audience: java.lang.String,
    subject: java.lang.String,
    publicKey: java.lang.String,
    privateKey: java.lang.String,
    contentEncoding: webDashPushLib.webDashPushLibStrings.aesgcm,
    expiration: scala.Double
  ): webDashPushLib.Anon_AuthorizationCryptoKey = js.native
  def sendNotification(subscription: PushSubscription): js.Promise[SendResult] = js.native
  def sendNotification(subscription: PushSubscription, payload: java.lang.String): js.Promise[SendResult] = js.native
  def sendNotification(subscription: PushSubscription, payload: java.lang.String, options: RequestOptions): js.Promise[SendResult] = js.native
  def sendNotification(subscription: PushSubscription, payload: nodeLib.Buffer): js.Promise[SendResult] = js.native
  def sendNotification(subscription: PushSubscription, payload: nodeLib.Buffer, options: RequestOptions): js.Promise[SendResult] = js.native
  def sendNotification(subscription: PushSubscription, payload: scala.Null, options: RequestOptions): js.Promise[SendResult] = js.native
  def setGCMAPIKey(): scala.Unit = js.native
  def setGCMAPIKey(apiKey: java.lang.String): scala.Unit = js.native
  def setVapidDetails(subject: java.lang.String, publicKey: java.lang.String, privateKey: java.lang.String): scala.Unit = js.native
}

