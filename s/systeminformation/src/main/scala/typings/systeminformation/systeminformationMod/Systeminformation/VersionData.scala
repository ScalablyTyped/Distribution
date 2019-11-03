package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionData extends js.Object {
  var docker: String
  var gcc: String
  var git: String
  var grunt: String
  var gulp: String
  @JSName("java")
  var java_ : String
  var kernel: String
  var mongodb: String
  var mysql: String
  var nginx: String
  var node: String
  var npm: String
  var openssl: String
  var perl: String
  var php: String
  var pip: String
  var pip3: String
  var pm2: String
  var postfix: String
  var postgresql: String
  var python: String
  var python3: String
  var redis: String
  var systemOpenssl: String
  var systemOpensslLib: String
  var tsc: String
  var v8: String
  var virtualbox: String
  var yarn: String
}

object VersionData {
  @scala.inline
  def apply(
    docker: String,
    gcc: String,
    git: String,
    grunt: String,
    gulp: String,
    java_ : String,
    kernel: String,
    mongodb: String,
    mysql: String,
    nginx: String,
    node: String,
    npm: String,
    openssl: String,
    perl: String,
    php: String,
    pip: String,
    pip3: String,
    pm2: String,
    postfix: String,
    postgresql: String,
    python: String,
    python3: String,
    redis: String,
    systemOpenssl: String,
    systemOpensslLib: String,
    tsc: String,
    v8: String,
    virtualbox: String,
    yarn: String
  ): VersionData = {
    val __obj = js.Dynamic.literal(docker = docker, gcc = gcc, git = git, grunt = grunt, gulp = gulp, kernel = kernel, mongodb = mongodb, mysql = mysql, nginx = nginx, node = node, npm = npm, openssl = openssl, perl = perl, php = php, pip = pip, pip3 = pip3, pm2 = pm2, postfix = postfix, postgresql = postgresql, python = python, python3 = python3, redis = redis, systemOpenssl = systemOpenssl, systemOpensslLib = systemOpensslLib, tsc = tsc, v8 = v8, virtualbox = virtualbox, yarn = yarn)
    __obj.updateDynamic("java")(java_)
    __obj.asInstanceOf[VersionData]
  }
}

