```
// Type definitions for swagger-restify-mw 0.7
// Project: https://github.com/apigee-127/swagger-restify#readme
// Definitions by: Michael Mrowetz <https://github.com/micmro>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.4
/* =================== USAGE ===================
import * as SwaggerRestify from "swagger-restify-mw";
import * as restify from "restify";

let app = restify.createServer();

let config = {
  appRoot: __dirname // required config
} as SwaggerRestify.Config;

SwaggerRestify.create(config, function(err, swaggerRestify) {
  if (err) { throw err; }

  swaggerRestify.register(app);

  let port = process.env.PORT || 10010;
  app.listen(port);

  if (swaggerRestify.runner.swagger.paths['/hello']) {
    console.log('try this:\ncurl http://127.0.0.1:' + port + '/hello?name=Scott');
  }
});

 =============================================== */

```