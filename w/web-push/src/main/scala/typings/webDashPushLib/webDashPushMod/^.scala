package typings
package webDashPushLib.webDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val supportedContentEncodings: webDashPushLib.Anon_AES128GCM = js.native
  def encrypt(
    userPublicKey: java.lang.String,
    userAuth: java.lang.String,
    payload: java.lang.String,
    contentEncoding: webDashPushLib.webDashPushMod.ContentEncoding
  ): webDashPushLib.webDashPushMod.EncryptionResult = js.native
  def encrypt(
    userPublicKey: java.lang.String,
    userAuth: java.lang.String,
    payload: nodeLib.Buffer,
    contentEncoding: webDashPushLib.webDashPushMod.ContentEncoding
  ): webDashPushLib.webDashPushMod.EncryptionResult = js.native
  def generateRequestDetails(subscription: webDashPushLib.webDashPushMod.PushSubscription): webDashPushLib.webDashPushMod.RequestDetails = js.native
  def generateRequestDetails(subscription: webDashPushLib.webDashPushMod.PushSubscription, payload: java.lang.String): webDashPushLib.webDashPushMod.RequestDetails = js.native
  def generateRequestDetails(
    subscription: webDashPushLib.webDashPushMod.PushSubscription,
    payload: java.lang.String,
    options: webDashPushLib.webDashPushMod.RequestOptions
  ): webDashPushLib.webDashPushMod.RequestDetails = js.native
  def generateRequestDetails(subscription: webDashPushLib.webDashPushMod.PushSubscription, payload: nodeLib.Buffer): webDashPushLib.webDashPushMod.RequestDetails = js.native
  def generateRequestDetails(
    subscription: webDashPushLib.webDashPushMod.PushSubscription,
    payload: nodeLib.Buffer,
    options: webDashPushLib.webDashPushMod.RequestOptions
  ): webDashPushLib.webDashPushMod.RequestDetails = js.native
  def generateRequestDetails(
    subscription: webDashPushLib.webDashPushMod.PushSubscription,
    payload: scala.Null,
    options: webDashPushLib.webDashPushMod.RequestOptions
  ): webDashPushLib.webDashPushMod.RequestDetails with webDashPushLib.Anon_Body = js.native
  @JSName("generateRequestDetails")
  def `generateRequestDetails_<intersection>`(subscription: webDashPushLib.webDashPushMod.PushSubscription): webDashPushLib.webDashPushMod.RequestDetails with webDashPushLib.Anon_Body = js.native
  @JSName("generateRequestDetails")
  def `generateRequestDetails_<intersection>`(subscription: webDashPushLib.webDashPushMod.PushSubscription, payload: java.lang.String): webDashPushLib.webDashPushMod.RequestDetails with webDashPushLib.Anon_BodyBuffer = js.native
  @JSName("generateRequestDetails")
  def `generateRequestDetails_<intersection>`(
    subscription: webDashPushLib.webDashPushMod.PushSubscription,
    payload: java.lang.String,
    options: webDashPushLib.webDashPushMod.RequestOptions
  ): webDashPushLib.webDashPushMod.RequestDetails with webDashPushLib.Anon_BodyBuffer = js.native
  @JSName("generateRequestDetails")
  def `generateRequestDetails_<intersection>`(subscription: webDashPushLib.webDashPushMod.PushSubscription, payload: nodeLib.Buffer): webDashPushLib.webDashPushMod.RequestDetails with webDashPushLib.Anon_BodyBuffer = js.native
  @JSName("generateRequestDetails")
  def `generateRequestDetails_<intersection>`(
    subscription: webDashPushLib.webDashPushMod.PushSubscription,
    payload: nodeLib.Buffer,
    options: webDashPushLib.webDashPushMod.RequestOptions
  ): webDashPushLib.webDashPushMod.RequestDetails with webDashPushLib.Anon_BodyBuffer = js.native
  def generateVAPIDKeys(): webDashPushLib.webDashPushMod.VapidKeys = js.native
  def getVapidHeaders(
    audience: java.lang.String,
    subject: java.lang.String,
    publicKey: java.lang.String,
    privateKey: java.lang.String,
    contentEncoding: webDashPushLib.webDashPushMod.ContentEncoding
  ): webDashPushLib.Anon_AuthorizationCryptoKeyString = js.native
  def getVapidHeaders(
    audience: java.lang.String,
    subject: java.lang.String,
    publicKey: java.lang.String,
    privateKey: java.lang.String,
    contentEncoding: webDashPushLib.webDashPushMod.ContentEncoding,
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
  def sendNotification(subscription: webDashPushLib.webDashPushMod.PushSubscription): js.Promise[webDashPushLib.webDashPushMod.SendResult] = js.native
  def sendNotification(subscription: webDashPushLib.webDashPushMod.PushSubscription, payload: java.lang.String): js.Promise[webDashPushLib.webDashPushMod.SendResult] = js.native
  def sendNotification(
    subscription: webDashPushLib.webDashPushMod.PushSubscription,
    payload: java.lang.String,
    options: webDashPushLib.webDashPushMod.RequestOptions
  ): js.Promise[webDashPushLib.webDashPushMod.SendResult] = js.native
  def sendNotification(subscription: webDashPushLib.webDashPushMod.PushSubscription, payload: nodeLib.Buffer): js.Promise[webDashPushLib.webDashPushMod.SendResult] = js.native
  def sendNotification(
    subscription: webDashPushLib.webDashPushMod.PushSubscription,
    payload: nodeLib.Buffer,
    options: webDashPushLib.webDashPushMod.RequestOptions
  ): js.Promise[webDashPushLib.webDashPushMod.SendResult] = js.native
  def sendNotification(
    subscription: webDashPushLib.webDashPushMod.PushSubscription,
    payload: scala.Null,
    options: webDashPushLib.webDashPushMod.RequestOptions
  ): js.Promise[webDashPushLib.webDashPushMod.SendResult] = js.native
  def setGCMAPIKey(): scala.Unit = js.native
  def setGCMAPIKey(apiKey: java.lang.String): scala.Unit = js.native
  def setVapidDetails(subject: java.lang.String, publicKey: java.lang.String, privateKey: java.lang.String): scala.Unit = js.native
}

